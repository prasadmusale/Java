//step 1 : Import the package .
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException , SQLException{
        //step 2 : Load and Register the Driver
        Class.forName("org.postgresql.Driver");

        //step 3 : Establish A Connection
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String password = "0000";
        Connection con = DriverManager.getConnection(url, uname, password);
        System.out.println("Connection Established");

        //step 4 : Create A Statement
        Statement st = con.createStatement();

        //Use Prepared Statement when you have to take input from user .
        //String sql1 = "INSERT INTO public.\"Student\" VALUES(?,?,?)";
        //int uid = 4;
        //String uname = "Dear";
        //int umarks = 98;
        // PreparedStatement pst = con.prepareStatement(sql);
        //st.setInt(1,uid);
        //st.setString(2,uname);
        //st.setInt(3,umarks);

        //Use Callable Statement when we have to run stored Procedure .

        //step 5 : Execute A Statement
        String sql = "SELECT * from public.\"Student\";";
        //String sql1 = "INSERT INTO public.\"Student\" VALUES(6 , 'Romu' , 50)";
        //String sql2 = "UPDATE public.\"Student\" SET name = 'Sham' WHERE id = 6";
        //String sql3 = "DELETE * FROM public.\"Student\" WHERE id = 5" ;

        ResultSet result = st.executeQuery(sql);
        //int rowsupdated = st.executeUpdate() //same method for all update , delete , insert queries gives affeced rows as output .
        //boolean resultType = st.execute() //Implement for any type of query . Gives true result for select queries and false result for insert , update and delete queries .
        //If st.execute() used for select query then has to get result by running method st.getResultSet() and storing in result set type of object.

        //step 6 : Process The Result
        while(result.next()){
            System.out.print(result.getInt("id") + " - ");
            System.out.print(result.getString("name")+ " - ");
            System.out.println(result.getInt("marks"));
        }

        //step 7 : Close The Connection
        con.close();
        System.out.println("Connection Closed");


    }
}