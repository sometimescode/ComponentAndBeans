<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<h5>[TEST HTML]</h5>

<hr>
Passed key1 from param tag: <s:property value="%{parameters.key1}"/>

<hr>
HelloWord action's message variable: <s:property value="message"></s:property>
<hr>

Calling the bean...
<s:bean name="com.example.example.BeanTing" var="beanVariable">
    <s:param name="userId" value="%{parameters.key1}"/>
    We're in the bean.
    UserId: <s:property value="userId"/>
    UserModel: <s:property value="userModel"/>
    valueStackCheck: <s:property value="valueStackCheck"/>
  </s:bean>
 <hr>
 We're out the bean but now using the beanVariable.
 UserId: <s:property value="#beanVariable.userId"/>
 UserModel: <s:property value="#beanVariable.userModel"/>
 valueStackCheck: <s:property value="#beanVariable.valueStackCheck"/>
<hr>