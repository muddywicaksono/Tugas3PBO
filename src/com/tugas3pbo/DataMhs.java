package com.tugas3pbo;

import javax.swing.*;

public class DataMhs extends JFrame {
    JLabel lJudul, lNama, lNIM, lJenis, lAgama, lAlamat;
    JTextField fNama,fNIM;
    JRadioButton rbPria,rbWanita;
    String[] ListAgama = {"Islam","Kristen","Katolik","Hindu","Budha","Konghucu"};
    JComboBox cbAgama;
    JTextArea taAlamat;
    JButton btnOK;

    public void datamhs(){
        lJudul = new JLabel("DATA DIRI MAHASISWA");
        lNama = new JLabel("Nama");
        fNama = new JTextField(30);
        lNIM = new JLabel("NIM");
        fNIM = new JTextField(9);
        lJenis = new JLabel("Jenis Kelamin");
        rbPria = new JRadioButton("L");
        rbWanita = new JRadioButton("P");
        lAgama = new JLabel("Agama");
        cbAgama = new JComboBox(ListAgama);
        lAlamat = new JLabel("Alamat");
        taAlamat = new JTextArea();
        btnOK = new JButton("OK");

        ButtonGroup kelamin = new ButtonGroup();
        kelamin.add(rbPria);
        kelamin.add(rbWanita);

        setLayout(null);
        add(lJudul);
        add(lNama);
        add(fNama);
        add(lNIM);
        add(fNIM);
        add(lJenis);
        add(rbPria);
        add(rbWanita);
        add(lAgama);
        add(cbAgama);
        add(lAlamat);
        add(taAlamat);
        add(btnOK);

        lJudul.setBounds(150,20,300,20);
        lNama.setBounds(50,60,100,30);
        fNama.setBounds(150,60,200,25);
        lNIM.setBounds(50,110,100,30);
        fNIM.setBounds(150,110,200,25);
        lJenis.setBounds(50,160,100,30);
        rbPria.setBounds(150,160,50,30);
        rbWanita.setBounds(200,160,50,30);
        lAgama.setBounds(50,210,100,30);
        cbAgama.setBounds(150,210,200,25);
        lAlamat.setBounds(50,260,100,30);
        taAlamat.setBounds(150,260,200,100);
        btnOK.setBounds(290,370,60,30);


        setSize(450,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}