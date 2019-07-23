<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 04/06/2019
  Time: 5:18 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculation</title>
  </head>
  <body>
    <h1>Calculation Example</h1>
    <form method="get" action="calculation">
      <table>
        <tr>
          <td>First Oprerand</td>
          <td><input type="text" name="gt1"></td>
        </tr>
        <tr>
          <td>Operator</td>
          <td>
            <select name="operator">
              <option value="+">Add</option>
              <option value="-">Sub</option>
              <option value="*">Mul</option>
              <option value="/">Div</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Second Operand</td>
          <td><input type="text" name="gt2"></td>
        </tr>
      </table>
      <input type="submit" value="Calculation">
    </form>
  </body>
</html>
