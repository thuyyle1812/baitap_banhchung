package org.example.baitap_spring_mvc.ripostory;



import org.example.baitap_spring_mvc.modell.Cake;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CakeRepository {
    List<Cake> list = new ArrayList<> ( );



    public List<Cake> getCakeList () {
        return list;
    }

    public void createCake ( Cake cake ) {
        list.add ( cake );
    }
}