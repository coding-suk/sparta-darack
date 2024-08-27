package studyWithTutor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * 프로그램의 시작점
         */

            // JVM
            // stack
            // method(Static)
            // heap
            // ====
            // a
            //  .name = "john"
            //  .status = "bad"
            // ====
            // ====
            // b
            //  .name = "steve"
            //  .status = "bad"
            // ====

            Character a = new Character("john", "ok");
            Character b = new Character("steve", "ok");
            String status = a.getStatus();

            String status1 = b.getStatus();
            ///
            ///
            ///
            ///
            ///
            a.setStatus("bad");
            b.setStatus("bad");
    }


}
