package z18;

import java.util.Objects;

public class Try5 {

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key; }

    static class Custom {
        Integer key;

        private Custom() {
        }

        public Integer getDetails() {
            return this.key;
        }
    }
    public void main(String[] args) {
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
}

