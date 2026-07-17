package Framework;

import java.time.Duration;

public class PontuacaoDecrescente implements PoliticaPontuacao{
    public int acertou(Duration tempo) {

        long segundos = tempo.getSeconds();

        if(segundos <=5){
            return 10;
        }
        else if(segundos <=10){
            return 5;
        }
        else if(segundos <= 15){
            return 4;
        }
        else{
            return 2;
        }
    }

    public int errou(Duration tempo){
        return 0;
    }
}

