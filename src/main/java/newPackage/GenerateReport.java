package newPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.wickedsource.docxstamper.DocxStamper;
import org.wickedsource.docxstamper.DocxStamperConfiguration;


public class GenerateReport {
    public static void main(String[] args) throws FileNotFoundException, Docx4JException, IOException {
        DocxStamper stamper = new DocxStamper(new DocxStamperConfiguration());
        DocxContext context = new DocxContext();
        context.setName("Vlad");
        InputStream template = new FileInputStream(new File("template.docx"));
        OutputStream out = new FileOutputStream("output_template.docx");
        stamper.stamp(template, context, out);
        out.close();
    }
}