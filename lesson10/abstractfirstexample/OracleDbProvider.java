package lesson10.abstractfirstexample;

public class OracleDbProvider extends DbProvider{

    @Override
    void connectToBb(){
        //logic for Postgres
    }

    @Override
    void disconnectFromDb(){
        //logic for Postgres
    }
}
