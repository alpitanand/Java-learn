import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class InputReader {

    private InputStream stream;
    private byte[] buf = new byte[2048];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public int readInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public String readString() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public boolean isSpaceChar(int c) {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public String next() {
        return readString();
    }

    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);
    }
}

class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object...objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }

    public void printLine(Object...objects) {
        print(objects);
        writer.println();
    }

    public void close() {
        writer.close();
    }

    public void flush() {
        writer.flush();
    }

}

class IOUtils {

    public static int[] readIntArray(InputReader in, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = in.readInt();
        return array;
    }

}


/**
 * Created by Alpit on 16-08-2017.
 */
class prime_prime90 {
    public static void main(String args[]) throws IOException {

//        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(obj.readLine());
        InputReader in 		= new InputReader(System.in);
        OutputWriter out	=	new OutputWriter(System.out);
        int a = in.readInt();
        int count = 0;
        int count2 = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,0);
        hashMap.put(2, 0);
        boolean m[] = seiveoferoth();
        m[0] = false;
        m[1] = false;
        m[2] = true;
        for (int k = 2; k <= 1000000; k++) {
            if (m[k]) {
                count=count+1;
                hashMap.put(k, count);

            }

            else {
                hashMap.put(k,count);
            }
        }
        for (int i = 0; i < a; i++) {
//            String s = in.readString();
//            String t[] = s.split(" ");

            int b = in.readInt();
            int c = in.readInt();
            for (int r = b; r <= c; r++) {

                int val = hashMap.get(r);
                if (m[val]) {
                    count2++;
                }
            }
            out.printLine(count2);
            count2 = 0;


        }
        out.close();

    }

    private static boolean[] seiveoferoth() {
        int c = 1000000;


        boolean prime[] = new boolean[c + 1];

        for (int i = 0; i <= c; i++) {
            prime[i] = true;
        }
        for (int i = 2; i * i <= Math.sqrt(c); i++) {
            if (prime[i]) {
                for (int h = 2 * i; h <= c; h += i) {
                    prime[h] = false;
                }
            }
        }
        return prime;

    }
}


 