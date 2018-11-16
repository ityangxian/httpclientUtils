package com.test.jsonreplace;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;

public class GetXMLNodes {

    @Test
    public void getNode() throws Exception {
        String path = "C:\\Users\\eden.yang\\Desktop\\jsonreplace\\src\\main\\resources\\EnterpriseWS.wsdl";

        Document doc = Jsoup.parse(new File(path), "UTF-8");
        Elements e = doc.select("portType operation");

        e.forEach((a) -> System.out.println(a.attr("name") + "==" + e.size()));
    }
}
