package javapractice.scratch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hii {

        @Autowired
        private final Testing testing;

    public Hii(Testing testing) {
        this.testing = testing;
    }

//        private Testing t; // initialise this using springboot autowiring feature


        public void run() {
            testing.run();
        }
    }
