# 💡 What is JDBC?

**JDBC (Java Database Connectivity)** is a **Java API** that allows Java programs to connect to and interact with a **relational database** (like MySQL, Oracle, PostgreSQL, etc.).

It provides methods to:
- Establish a connection with the database
- Send SQL queries
- Retrieve and process results
- Perform database updates

---

## 📦 JDBC Package:
```java
import java.sql.*;
```

---

## 🔄 JDBC Architecture:

1. **JDBC API** – Set of interfaces and classes in Java (`java.sql`)
2. **JDBC Driver** – Software that connects Java code to the database

---

## 🔧 Steps to Connect to a Database using JDBC:

### ✅ 1. Load the JDBC Driver
```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

### ✅ 2. Establish a Connection
```java
Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/your_database", "username", "password");
```

### ✅ 3. Create a Statement
```java
Statement stmt = conn.createStatement();
```

### ✅ 4. Execute a Query
```java
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
```

### ✅ 5. Process the Results
```java
while (rs.next()) {
    System.out.println(rs.getString("name") + " - " + rs.getInt("marks"));
}
```

### ✅ 6. Close the Connection
```java
rs.close();
stmt.close();
conn.close();
```

---

## 🧪 Simple Example (MySQL):

```java
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to DB
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school", "root", "your_password");

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Step 5: Process Results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // Step 6: Close
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

---

## 🔍 Types of JDBC Drivers:

| Type | Name                   | Description |
|------|------------------------|-------------|
| 1    | JDBC-ODBC Bridge       | Connects via ODBC driver (deprecated) |
| 2    | Native-API Driver      | Uses native client library |
| 3    | Network Protocol Driver| Connects via middleware |
| 4    | Thin Driver (Pure Java)| Directly connects using Java (most popular) |

---

## 📌 Common JDBC Interfaces:

- `Connection` – Connects to the DB
- `Statement` – Executes static SQL
- `PreparedStatement` – Executes dynamic, parameterized SQL (prevents SQL injection)
- `CallableStatement` – Calls stored procedures
- `ResultSet` – Holds the data retrieved

---

## 🚨 Why Use `PreparedStatement`?

```java
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE name=?");
ps.setString(1, "John");
ResultSet rs = ps.executeQuery();
```
✅ Prevents SQL injection  
✅ Better performance for repeated queries

---

## 🔐 JDBC Best Practices:

- Always close `ResultSet`, `Statement`, and `Connection`
- Use **`try-with-resources`** to manage connections automatically
- Prefer `PreparedStatement` over `Statement`
- Handle exceptions properly
