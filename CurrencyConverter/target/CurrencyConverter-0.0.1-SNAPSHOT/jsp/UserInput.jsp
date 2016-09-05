<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<SCRIPT language=Javascript>
       <!--
       function isNumberKey(evt)
       {
          var charCode = (evt.which) ? evt.which : evt.keyCode;
          if (charCode != 46 && charCode > 31 && (charCode < 48 || charCode > 57))
             return false;

          return true;
       }
       //-->
    </SCRIPT>
</head>
<body>
	<form action="submitUserInput" method="post">
		<table>
			<tr>
				<td>Input Amount:</td>
				<td><input type="text" name="amount" value="" onkeypress="javascript:return isNumberKey(event)"></td>
			</tr>
			<tr>
				<td>Input Currency:</td>
				<td><select name="inputCurrency">
						<option value="usd">USD</option>
						<option value="gbp">GBP</option>
						<option value="inr">INR</option>
						<option value="eur">EUR</option>
						<option value="aud">AUD</option>
				</select></td>
			</tr>
			<tr>
				<td>Output Currency:</td>
				<td><select name="outputCurrency">
						<option value="Usd">USD</option>
						<option value="Gbp">GBP</option>
						<option value="Inr">INR</option>
						<option value="Eur">EUR</option>
						<option value="Aud">AUD</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>