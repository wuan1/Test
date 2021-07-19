public class sheji {
}
interface Connection {
    public void connect();
}
//MySQL数据库连接类：具体产品
class MySQLConnection implements Connection{
    public void connect()
    {
        System.out.println("连接MySQL数据库。");
    }
}
//数据库语句接口：抽象产品
interface Statement
{
    public void executeStatement();
}
//MySQL数据库语句类：具体产品
class MySQLStatement implements Statement
{
    public void executeStatement()
    {
        System.out.println("执行MySQL数据库语句");
    }
}
//数据库工厂接口：抽象工厂
interface DBFactory
{
    public Connection createConnection();
    public Statement createStatement();
}
//MySQL数据库工厂：具体工厂
class MySQLFactory implements DBFactory{
    public Connection createConnection()
    {
        return new MySQLConnection();
    }
    public Statement createStatement()
    {
        return new MySQLStatement();
    }
}
//客户端测试类
class Client
{
    public static void main(String[] args){
        DBFactory factory;
        Connection connection;
        Statement statement;
        factory = new MySQLFactory();
        connection = factory.createConnection();
        statement = factory.createStatement();
        connection.connect();
        statement.executeStatement();
    }
}

