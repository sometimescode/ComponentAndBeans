# ComponentAndBeans
Testing Component and Beans of Struts2. Not sure if this is proper implementation. Still confused on key difference in this scenario between beans, component, and include because it looks like include also has access to the parent's value stack. Beans can be set to return a jsp file so it looks just like a component. Component relies on beans to get the rest of the information. Maybe you can push the beans outside of component and pass it as variable or configure it so that parent holds the variables needed by component, but 

Only important page is http://localhost:8080/.
HelloWorld.jsp contains the call to component.
<s:component template="comp.jsp">
    <s:param name="key1" value="0"/>
</s:component>
Values with specific results are 0,1. The rest are default returns. Component is found in /template/xhtml/comp.jsp. Component uses bean to generate data that it will use. 
Notes:
1. The current directory where the component (comp.jsp) is found is the default directory that Struts2 uses. You can change the defaults by configuring struts.xml or using a struts properties file, but I haven't tried.
2. It's important that the java file for the Bean has a 0 argument constructor because that is what gets called when you create the bean. I initially had no constructor
and placed important logic in execute() but it didn't run.
