        List<Double> lista = new ArrayList<>(); //Polimorfizmus miatt kezelhetjük List-ként.

        //beszúrás a lista végére
        lista.add(1.2);
        lista.add(2.1);
        lista.add(3.10);
        lista.add(2.1);
        lista.add(3.05);

        //beszúrás a legelső helyre -> 3.55, 1.2, 2.1, 3.1, 2.1, 3.05
        lista.add(0, 3.55);

        //a legelső elem törlése -> 1.2, 2.1, 3.1, 2.1, 3.05
        lista.remove(0);

        //a legelső 2.1 érték törlése -> 1.2, 3.1, 2.1, 3.05
        lista.remove(2.1);
