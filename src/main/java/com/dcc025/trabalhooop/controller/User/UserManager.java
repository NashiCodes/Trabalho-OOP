package com.dcc025.trabalhooop.controller.User;

import com.dcc025.trabalhooop.model.Place;
import com.dcc025.trabalhooop.persistence.*;
import com.dcc025.trabalhooop.view.AdmView;
import com.dcc025.trabalhooop.view.UserView;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;

public class UserManager implements WindowListener {

    private final UserView tela;
    private List<Place> places;
    private final Persistence<Place> placePersistence;

    public UserManager(UserView tela) {
        this.tela = tela;
        this.placePersistence = new PlacePersistence();
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        places = tela.listPlaces(places); //Pega os lava jatos da tela
        this.placePersistence.save(places); //Salva os lava jatos no banco de dados
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        this.places = this.placePersistence.findAll();  //Pega todos os lava jatos do banco de dados
        tela.carregaPlaces(places); //Carrega os lava jatos na tela
        tela.display(); //Exibe a tela
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
