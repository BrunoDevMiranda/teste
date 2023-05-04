package br.com.lojafini2.application;

import br.com.lojafini2.data.model.*;
import br.com.lojafini2.factory.DbException;
import br.com.lojafini2.factory.connection.*;
import com.lowagie.text.DocumentException;

import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws DocumentException, IOException, InterruptedException, DbException {

        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();

//cliente.setId(10);
//        cliente.setNome("açica");
//        cliente.setCpf("1ddd23");


//        clienteDao.update(cliente);

//        for (Cliente c: clienteDao.findCliente()) {
//            System.out.println("Cliente:  "+ c.getNome());
//        }

//        clienteDao.findByCodigo(10);

        clienteDao.delete(10);




    }
}








