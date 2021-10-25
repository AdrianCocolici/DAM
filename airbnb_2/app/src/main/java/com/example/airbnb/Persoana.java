package com.example.airbnb;

import android.os.Parcel;
import android.os.Parcelable;

public class Persoana implements Parcelable {
    private String nume;
    private String prenume;
    private String email;
    private String telefon;

    public Persoana(String nume, String prenume, String email, String telefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.telefon = telefon;
    }

    public Persoana() {
    }

    protected Persoana(Parcel in) {
        nume = in.readString();
        prenume = in.readString();
        email = in.readString();
        telefon = in.readString();
    }

    public static final Creator<Persoana> CREATOR = new Creator<Persoana>() {
        @Override
        public Persoana createFromParcel(Parcel in) {
            return new Persoana(in);
        }

        @Override
        public Persoana[] newArray(int size) {
            return new Persoana[size];
        }
    };

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "telefon='" + telefon + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nume);
        parcel.writeString(prenume);
        parcel.writeString(email);
        parcel.writeString(telefon);
    }
}
