package com.example;

import com.example.tk.TkApp;
import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.FtCli;

import java.util.Map;

public final class Main {
    public static void main(final String... args) throws Exception {
        new FtCli(
            new TkApp(), args
        ).start(Exit.NEVER);
    }
}
