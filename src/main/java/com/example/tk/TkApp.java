package com.example.tk;

import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.rs.RsText;

import java.io.IOException;

/**
 * Created by anton.kholetskiy on 5/16/2017.
 */
public class TkApp implements Take {

    public Response act(Request request) throws IOException {
        return new RsText("Hello from heroku");
    }
}
