package org.example.io_pattern;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LowerCaseTextDecorator extends FilterInputStream {
    protected LowerCaseTextDecorator(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return c == -1 ? c : Character.toLowerCase((char) c);
    }

    @Override
    public byte[] readAllBytes() throws IOException {
        byte[] bytes = in.readAllBytes();
        String s = new String(bytes, StandardCharsets.UTF_8);
        return s.toLowerCase().getBytes(StandardCharsets.UTF_8);
    }
}
