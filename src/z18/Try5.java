package z18;

import java.util.Objects;

public class Try5 {
    public Try5() {
    }

    public static void main(String[] args) {
        Custom custom = new Custom();
        try {
            if (Objects.isNull(custom.getDetails())) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program is over");
        }
    }

    private static class Custom {
        Integer key;
        private Custom() {
        }
        public Integer getDetails() {
            return this.key;
        }
    }
}


