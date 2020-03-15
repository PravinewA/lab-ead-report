# **Lab 3**
# **Date : 14th march 2020**
# **Objective 1: Servlet Interface**

# **Theory :**

Servlet Interface, When the Servlet is deployed in the server the Servlet container creates life cycle of the Servlet.
The central abstraction in the Servlet API is the Servlet interface, all the Servlets have to implement this interface 
either directly or by extending a class such as GenericServlet, HttpServlet. Following are the different methods of servlet interface.
1. public void init(ServletConfig config)
2. public void service(ServletRequest request,ServletResponse response)
3. public void destroy()
4. public ServletConfig getServletConfig()
5. public String getServletInfo()
<!-- Example is provided above -->

# **Objective 2: Java Servlet POST Example**

# **Theory :**

A generally more reliable method of passing information to a backend program is the POST method. This packages the information in exactly the same way as GET method, but instead of sending it as a text string after a ? (question mark) in the URL it sends it as a separate message. This message comes to the backend program in the form of the standard input which you can parse and use for your processing. Servlet handles this type of requests using doPost() method.

Reading Form Data using Servlet

Servlets handles form data parsing automatically using the following methods depending on the situation −
- getParameter() − You call request.getParameter() method to get the value of a form parameter.
- getParameterValues() − Call this method if the parameter appears more than once and returns multiple values, for example checkbox.
- getParameterNames() − Call this method if you want a complete list of all parameters in the current request.
<!-- Example is provided above -->

# **Objective 3: Understanding JSP**

# **Theory :**

A JavaServer Pages component is a type of Java servlet that is intended to fulfill the role of a user interface for a Java web application. Web developers  create JSPs as text files that join HTML or XHTML code, XML elements, and embedded JSP actions and commands. Using JSP, you can assemble input from users over Webpage forms, present records from a database or different sources, and build Web pages dynamically. JSP tags can be used for a variety of purposes, such as retrieving data from a database or registering user preferences, accessing JavaBeans components, passing control among pages, and sharing information between requests, pages etc.JavaServer Pages usually serve the same purpose as programs executed using the Common Gateway Interface (CGI).

### Comparision of JSP and Servlet 
1. Session management is automatically enabled in JSP where as in Servlet, by default session management is disabled, the user has to enable it explicitly
2. In MVC Pattern, JSP is used for displaying output data i.e in MVC it is a view but in Servlet, it plays a controller role in MVC Pattern.
3. JSP is slower than Servlet because the initial step in JSP life Cycle is translation of JSP to java code also then compile where as Servlet is much more fast than the JSP.
4. In JSP package is imported wherever top, middle or bottom but in servlet, every package needs to be imported on the top of the servlet.

### JSP Scripting Element.
The scripting elements provides the ability to insert java code inside the jsp. There are three types of scripting elements:

-scriptlet tag
-expression tag
-declaration tag

#### JSP Scriplet Tag
A scriptlet tag is used to execute java source code in JSP. Syntax is as follows:
<%  java source code %> 

#### JSP Expression Tag
The code placed within JSP expression tag is written to the output stream of the response. So you need not write out.print() to write data. It is mainly used to print the values of variable or method.
<%=  statement %>  

#### JSP Declaration Tag
The JSP declaration tag is used to declare fields and methods.The code written inside the jsp declaration tag is placed outside the service() method of auto generated servlet.So it doesn't get memory at each request.The syntax of the declaration tag is as follows:
<%!  field or method declaration %>  

<!-- Example is provided above -->

