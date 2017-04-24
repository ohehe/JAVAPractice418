package com.ling.designpatterns.flyweight;/**
 * Created by Administrator on 2017/4/23.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 数据库连接池
 *
 * @author Administrator
 * @create 2017-04-23 23:44
 */
public class ConnectionPool {
    private Vector<Connection> pool ;

    private String url = "idbc:mysql://localhost:3306/test" ;
    private String username = "root" ;
    private String password = "root" ;
    private String driverClassName = "com.mysql.jdbc.Driver" ;

    private int poolSize = 100 ;
    private static ConnectionPool instance = null ;
    Connection conn = null ;

    /**
     * 初始化工作
     */
    private ConnectionPool() {
        pool = new Vector<Connection>(poolSize) ;
        for(int i = 0 ; i < poolSize ; i++){
            try {
                Class.forName(driverClassName) ;
                conn = DriverManager.getConnection(url,username,password) ;
                pool.add(conn) ;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * method:release
     * @description 返回连接到连接池
     * @param
     * @return void
     * @throws
     *
     * @author Administrator
     * @date 2017/4/24
     */
    public synchronized void release(){
        pool.add(conn) ;
    }

    public synchronized Connection getConnection(){
        if(pool.size() > 0){
            Connection conn = pool.get(0) ;
            pool.remove(conn) ;
            return conn ;
        }else{
            return null ;
        }
    }
}
