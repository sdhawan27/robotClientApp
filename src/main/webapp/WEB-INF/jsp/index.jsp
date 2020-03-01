<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<body>

<h2>Please  provide input data for walking</h2>
	<form:form name="walkForm" method="post" action ="/walk" modelAttribute="robot">
	    <form:label path="robotId">Robot Id</form:label>
	    <form:input path="robotId"/><br/>
	    <form:label path="batteryRemaining">Remaining Battery </form:label>
	    <form:input path="batteryRemaining"/><br/>
        <input type="submit" value="Walk"/> <br/>
    </form:form>

    <h2>Please  provide input data for weight lifting</h2>
      	<form:form name="liftForm" method="post" action ="/liftWeight" modelAttribute="robot">
              <form:label path="robotId">Robot Id</form:label> &nbsp; <form:input path="robotId"/><br/>
              <form:label path="batteryRemaining">Remaining Battery </form:label> &nbsp; <form:input path="batteryRemaining"/><br/>
              <form:label path="inputWeight">Weight</form:label> &nbsp; <form:input path="inputWeight"/><br/>
              <input type="submit" value="Lift Weight"/>
              </form:form>
           <h2>Please  provide input data for scan </h2>
            	<form:form  name="scanForm" method="post" action ="/scan" modelAttribute="robot"><br/>
                    <form:label path="barCode">Bar Code</form:label> &nbsp; <form:input path="barCode"/><br/>
                    <input type="submit" value="scan"/>
                 </form:form>



</body>

</html>