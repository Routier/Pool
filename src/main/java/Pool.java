public class Pool {
    private String[] films = new String[0];
    private int length;


    public Pool() {
        this.length = 5;
    }

    public Pool(int length) {
        this.length = length;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];  //временный массив
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];                        // "перенос" данных из основного массива
        }
        tmp[tmp.length - 1] = film;                   //добавление новых данных в конец массива
        films = tmp;                                  //присвоение временого массива основному
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int tmpLength;
        if (films.length < length) {
            tmpLength = films.length;
        } else {
            tmpLength = length;
        }
        String[] tmp = new String[tmpLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - (i + 1)];
        }
        return tmp;
    }

}

