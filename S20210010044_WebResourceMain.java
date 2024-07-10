/*
    NAME:- ABHISHIKTH BODA
    COURSE:- OOP
    ASSIGNMENT NUMBER:- 7
    DATE:- 29-09-2022
*/

import java.lang.String;

class WebResource {
    private String Domain_Name;
    private String Path_to_Resource;
    private String Name_of_Resource;
    private String Protocol;

    public WebResource(String Domain_Name, String Path_to_Resource, String Name_of_Resource) {
        this.Protocol = "http://www.";
        this.Domain_Name = Domain_Name;
        this.Path_to_Resource = Path_to_Resource;
        this.Name_of_Resource = Name_of_Resource;
    }

    public String getProtocol() {
        return Protocol;
    }

    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public String getDomain_Name() {
        return Domain_Name;
    }

    public void setDomain_Name(String Domain_Name) {
        this.Domain_Name = Domain_Name;
    }

    public String getPath_to_Resource() {
        return Path_to_Resource;
    }

    public void setPath_to_Resource(String Path_to_Resource) {
        this.Path_to_Resource = Path_to_Resource;
    }

    public String getName_of_Resource() {
        return Name_of_Resource;
    }

    public void setName_of_Resource(String Name_of_Resource) {
        this.Name_of_Resource = Name_of_Resource;
    }

    public String getFullURL() {
        return (Protocol + Domain_Name + Path_to_Resource + "/" + Name_of_Resource);
    }

}

class SecureWebResources extends WebResource {

    public SecureWebResources(String Domain_Name, String Path_to_Resource, String Name_of_Resource) {
        super(Domain_Name, Path_to_Resource, Name_of_Resource);
        super.setProtocol("https://www.");
    }

    @Override
    public String getFullURL() {
        return (super.getProtocol() + getDomain_Name() + getPath_to_Resource() + "/" + getName_of_Resource());
    }
}

class DynamicWebResource extends WebResource {
    private String servletName;
    private String jspTemplate;

    public DynamicWebResource(String Domain_Name, String Path_to_Resource, String Name_of_Resource,
            String servletName) {
        super(Domain_Name, Path_to_Resource, Name_of_Resource);
        this.servletName = servletName;
        this.jspTemplate = "org.iiits.IndexTemplate.jsp";
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getJspTemplate() {
        return jspTemplate;
    }

    public void setJspTemplate(String jspTemplate) {
        this.jspTemplate = jspTemplate;
    }

    @Override
    public String getFullURL() {
        return (super.getProtocol() + super.getDomain_Name() + "/" + getServletName().replace('.', '/'));
    }
}

class SecureDynamicWebResource extends DynamicWebResource {
    public SecureDynamicWebResource(String Domain_Name, String Path_to_Resource, String Name_of_Resource,
            String servletName) {
        super(Domain_Name, Path_to_Resource, Name_of_Resource, servletName);
        super.setProtocol("https://www.");
    }

    @Override
    public String getFullURL() {
        return (super.getProtocol() + super.getDomain_Name() + "/" + getServletName().replace('.', '/'));
    }
}

public class S20210010044_WebResourceMain {

    public static void printAllWebResourceURL(WebResource[] websites) {
        for (int i = 0; i < websites.length; i++) {
            System.out.println(websites[i].getFullURL());
            System.out.println("-------------------------------------");
        }
    }

    public static void main(String[] args) {

        System.out.println("NAME:- ABHISHIKTH BODA\nCOURSE:- OOP\nASSIGNMENT NUMBER:- 7\nDATE:- 29-09-2022\n\n");

        WebResource[] websites = new WebResource[10];

        websites[0] = new WebResource("build-your-website.co.uk", "/html", "index.htm");
        websites[1] = new WebResource("criminal-record.co.in", "/github", "index.cpp");
        websites[2] = new WebResource("google.com", "/github", "index.htm");
        websites[3] = new SecureWebResources("build-your-website.co.uk", "/html", "index.htm");
        websites[4] = new SecureWebResources("criminal-record.co.in", "/github", "index.java");
        websites[5] = new DynamicWebResource("build-your-website.co.uk", "/html", "index.htm",
                "org.iiits.IndexServlet");
        websites[6] = new DynamicWebResource("criminal-record.co.in", "/github", "index.js", "oop.lab_ass.lab7");
        websites[7] = new DynamicWebResource("google.com", "/github", "index.htm", "sem3.oop.project");
        websites[8] = new SecureDynamicWebResource("build-your-website.co.uk", "/html", "index.htm",
                "org.iiits.IndexServlet");
        websites[9] = new SecureDynamicWebResource("criminal-record.co.in", "/github", "index.flutter",
                "oop.lab_ass.lab7");

        printAllWebResourceURL(websites);
        System.out.println();
    }
}