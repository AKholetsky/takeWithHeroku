package com.example.tk;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;
import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.misc.Utf8OutputStreamWriter;
import org.takes.rs.RsEmpty;
import org.takes.rs.RsText;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by anton.kholetskiy on 5/16/2017.
 */
public class TkApp implements Take {

    public Response act(Request request) throws IOException {
        return new Response() {
            public Iterable<String> head() throws IOException {
                return new RsEmpty().head();
            }

            public InputStream body() throws IOException {

                final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final Writer writer = new Utf8OutputStreamWriter(baos);

                final JtwigTemplate template = JtwigTemplate.classpathTemplate("templates/example.twig");
                final JtwigModel model = JtwigModel.newModel().with("var", "greet universe");
                writer.write(template.render(model));
                writer.close();
                return new ByteArrayInputStream(baos.toByteArray());
            }
        };
    }
}
