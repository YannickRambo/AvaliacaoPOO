
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Klaian Conceição da Rosa e Yannick Machado da Silva Rambo
 */
public class BdArtista {

    public ArrayList<String> listaArtista;
    public ArrayList<String> listaArtistaO;

    public BdArtista() {
        listaArtista = new ArrayList();
        listaArtistaO = new ArrayList();

    }

    public void save(String artista) {
        listaArtista.add(artista);
        listaArtistaO.add(artista);
        JOptionPane.showMessageDialog(null, "O " + artista
                + " foi salvo com " + "sucesso!");

    }

    @Override
    public String toString() {
        String result = "Lista de Artistas\n";
        if (!listaArtista.isEmpty()) {
            for (int i = 0; i < listaArtista.size(); i++) {
                result += listaArtista.get(i) + "\n";
            }
        } else {
            result = "A lista encontra-se vazia!";
        }

        return result;

    }

    public String toStringO() {
        String result = "Lista de Artistas\n";
        Collections.sort(listaArtistaO);
        if (listaArtistaO.isEmpty()) {
            result = "A lista encontra-se vazia!";
        } else {
            for (int i = 0; i < listaArtistaO.size(); i++) {
                result += listaArtistaO.get(i) + "\n";
            }
        }

        return result;
    }

    public int getSize() {
        return listaArtista.size();
    }

    public String getArtista(int i) {
        String r = "";
        if (i >= 0) {
            r = String.valueOf(listaArtista.get(i));
        } else {
            r = "O Artista não existe!";
        }
        return r;
    }

    public void delete(int i, int iO) {
        if (i != -1) {
            listaArtista.remove(i);
            listaArtistaO.remove(iO);
            JOptionPane.showMessageDialog(null, "Artista excluído!");
        } else {
            JOptionPane.showMessageDialog(null, "O Artista não existe!");
        }

    }

    public int search(String artista) {
        boolean achou = false;
        int i = 0, r = -1;
        while (i < listaArtista.size() && !achou) {
            if (listaArtista.get(i).equals(artista)) {
                r = i;
                achou = true;

            }
            i++;
        }
        return r;

    }
    
    public int searchO(String artista) {
        boolean achou = false;
        int i = 0, r = -1;
        while (i < listaArtistaO.size() && !achou) {
            if (listaArtistaO.get(i).equals(artista)) {
                r = i;
                achou = true;

            }
            i++;
        }
        return r;

    }

    public void update(int i,int iO, String update) {
        if (i != -1 || update.length() > 0) {
            listaArtista.set(i, update);
            listaArtistaO.set(iO, update);
            JOptionPane.showMessageDialog(null, "O nome do artista foi modificado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "O nome do artista não foi modificado!");
        }

    }

    public void reset() {
        listaArtista.clear();
        listaArtistaO.clear();
    }
}
