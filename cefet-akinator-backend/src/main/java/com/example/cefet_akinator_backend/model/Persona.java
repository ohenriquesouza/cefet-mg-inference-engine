package com.example.cefet_akinator_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "personas")
@Data


public class Persona {
    String name;
    String imgUrl;
    List<Boolean> characteristicsList;
}

public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.setName("Alberto Pena Lara");
    persona1.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4782120U0");
    persona1.setCharacteristicsList(Arrays.asList(true, true, false,
    true, false, true,false, true, false,false, false, true,
    false, false, false,false, false, false,false, false, false,
    false, false, false,false, false, false,false, false, false,
    false, false, false,false, false, false,false, false, false,
    false, false, true, true, false, false,false, true, false,
    false, true, false, false, false, false,false, false, false,
    false, false, false, false, false, false,
    false, false, true, false));

    Persona persona2 = new Persona();
    persona2.setName("ALISSON MARQUES DA SILVA");
    persona2.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4509401E4");
    persona2.setCharacteristicsList(Arrays.asList(true, true, false, 
    true, false, true, true, false, false, false, false, true, 
    true, true, false, true, false, true, true, false, true, 
    false, false, false, false, false, false, false, false, false, 
    false, true, false, true, false, false, false, true, false, false, 
    false, true, true, false, false, false, false, false, false, false, 
    false, false, false, false, false, false, true, false, false, false, 
    false, false, false, false, false, false, false));

    Persona persona3 = new Persona();
    persona3.setName("ANDRÉ LUIZ MARAVILHA DA SILVA");
    persona3.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4209051Z0");
    persona3.setCharacteristicsList(Arrays.asList(true, true, false, 
    true, false, true, true, true, false, false, false, true, false, false, 
    false, true, false, true, true, false, false, true, true, false, false, false, 
    false, false, false, false, false, false, false, false, true, false, false, false, 
    true, false, false, false, false, false, true, false, false, false, false, false, false, 
    false, false, false, false, false, true, false, false, false, false, false, false, 
    false, false, false, false));

    Persona persona4 = new Persona();
    persona4.setName("CHRISTIAN GONÇALVES HERRERA");
    persona4.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4762822Z1");
    persona4.setCharacteristicsList(Arrays.asList(true, true, false, true, 
    false, true, false, false, false, false, false, true, 
    false, false, true, false, true, true, false, false, false, false, 
    true, true, true, true, false, true, false, false, false, false, 
    true, false, false, false, true, false, false, true, false, false, 
    false, false, false, false, false, false, false, false, false, false, 
    false, false, false, false, true, false, false, false, false, false, 
    false, false, false));

    Persona persona5 = new Persona();
    persona5.setName("DANIEL MORAIS DOS REIS");
    persona5.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4201153A5");
    persona5.setCharacteristicsList(Arrays.asList(true, true, true, 
    true, false, true, false, false, false, false, false, true, false, false, 
    false, true, false, true, true, false, false, false, false, true, true, false, 
    false, true, true, false, true, false, false, true, false, false, false, 
    true, true, false, true, false, false, false, false, false, false, false, false,
     false, false, false, false, false, false, false, true, false, false, false, 
     false, false, false, false, false, false, false));

    Persona persona6 = new Persona();
    persona6.setName("DIEGO ASCANIO SANTOS");
    persona6.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K2706192E1");
    persona6.setCharacteristicsList(Arrays.asList(true, true, true, 
    false, false, true, false, false, false, true, true, true, false, false, 
    true, false, false, false, false, true, true, false, false, false, false, 
    true, true, false, false, true, false, false, false, false, false, false, 
    false, false, false, false, false, true, false, false, false, false, false, 
    false, false, false, false, true, false, false, false, false, false, false, 
    false, false, false, false));

    Persona persona7 = new Persona();
    persona7.setName("EDUARDO HABIB BECHELANE MAIA");
    persona7.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4709998D9");
    persona7.setCharacteristicsList(Arrays.asList(true, true, true, true, 
    false, true, false, true, false, false, false, true, true, true, false, 
    true, false, true, true, false, false, false, false, false, false, false, 
    false, false, false, false, false, true, true, true, false, false, false, 
    true, false, false, true, false, true, true, false, false, false, false, 
    false, false, false, false, false, false, false, false, true, false, false, 
    false, false, false, false, false, false, false, false));

    Persona persona8 = new Persona();
    persona8.setName("HIGOR ALEXANDRE DUARTE MASCARENHAS");
    persona8.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K8483877U2");
    persona8.setCharacteristicsList(Arrays.asList(true, true, true, true, 
    false, true, true, false, false, false, false, true, true, true, true, 
    true, false, true, false, false, true, false, true, false, false, false, 
    false, false, false, false, false, false, true, true, false, true, false, 
    false, false, true, false, false, false, false, false, false, false, false,
    false, false, false, false, false, false, false, true, false, false, false, 
    false, false, false, false, false, false, false, false));

    Persona persona9 = new Persona();
    persona9.setName("MARCELO CARAMURU PIMENTEL FRAGA");
    persona9.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4710175J5");
    persona9.setCharacteristicsList(Arrays.asList(true, true, false, 
    false, false, true, false, false, false, false, false, true, true, 
    false, false, true, false, true, true, false, false, false, false, 
    false, true, false, false, false, false, false, false, false, false, 
    false, true, false, false, false, true, true, true, true, false, true, 
    false, false, false, false, false, false, false, false, false, false, 
    false, false, false, true, false, false, false, false, false, false, 
    false, false, false));

    Persona persona10 = new Persona();
    persona10.setName("MICHEL PIRES DA SILVA");
    persona10.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4127909P6");
    persona10.setCharacteristicsList(Arrays.asList(true, true, true, 
    true, true, true, true, true, true, false, false, true, true, false, 
    false, true, false, true, true, false, false, false, false, false, true, 
    false, false, false, false, false, true, false, true, false, true, false, 
    true, false, false, false, false, true, true, true, false, false, false, 
    false, false, false, false, false, false, false, false, false, false, false, 
    false, false, false, false, false, false, false, false));

    Persona persona11 = new Persona();
    persona11.setName("RAULIVAN RODRIGO DA SILVA");
    persona11.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4343870Y2");
    persona11.setCharacteristicsList(Arrays.asList(true, true, true, 
    true, false, false, false, false, false, false, false, 
    true, true, true, false, true, false, true, true, false, false, 
    false, false, false, false, false, false, false, false, true, false, 
    false, true, false, false, false, true, false, false, true, false, 
    true, false, false, false, false, false, false, false, false, false, 
    false, false, false, false, true, false, false, false, false, false, 
    false, false, false, false, false, false));

    Persona persona12 = new Persona();
    persona12.setName("THABATTA MOREIRA ALVES DE ARAÚJO");
    persona12.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4358266T5");
    persona12.setCharacteristicsList(Arrays.asList(true, false, false, true, 
    false, true, false, true, true, false, true, true, false, false, false, true, 
    false, true, true, false, false, true, false, true, false, false, false, false, 
    false, false, false, false, false, false, true, false, false, true, false, false, 
    true, false, false, false, false, false, false, false, false, false, false, false, 
    true, true, false, false, true, false, false, false, false, false, false, false, false, 
    false, false, false, false));

    Persona persona13 = new Persona();
    persona13.setName("THIAGO MAGELA RODRIGUES DIAS");
    persona13.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4594848E8");
    persona13.setCharacteristicsList(Arrays.asList(true, true, false, false, 
    true, false, false, false, false, false, true, false, false, false, true, 
    false, true, true, false, false, false, false, false, false, false, false, 
    false, false, false, false, true, false, false, false, true, false, false, 
    true, false, false, false, false, false, false, false, false, false, false, 
    false, false, false, true, false, true, false, false, false, false, false, false,
    false, false, false, false));

    Persona persona14 = new Persona();
    persona14.setName("THIAGO ALVES DE OLIVEIRA");
    persona14.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4486546Y5");
    persona14.setCharacteristicsList(Arrays.asList(true, true, false, false, 
    false, true, true, false, false, false, true, false, false, false, true, 
    false, true, true, false, false, false, false, true, false, false, false, 
    false, false, false, false, true, true, false, false, false, true, true, false,
     true, false, false, false, false, false, false, false, false, false, false, 
     false, false, true, true, false, false, false, false, false, false, false, 
     false, false, false, false));

    Persona persona15 = new Persona();
    persona15.setName("BRUNO FERREIRA ROSA");
    persona15.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4262603D6");
    persona15.setCharacteristicsList(Arrays.asList(true, true, false, true, 
    false, true, true, false, false, false, false, true, true, true, false,
     true, false, true, true, false, true, false, false, false, false, false, 
     false, false, false, false, false, true, false, true, false, false, false, 
     true, false, false, false, true, true, false, false, false, false, false, 
     false, false, false, false, false, false, false, false, false, true, false, 
     false, false, false, false, false, false, false, false, false));

    Persona persona16 = new Persona();
    persona16.setName("MIGUEL FERNANDO DE OLIVEIRA GUERRA");
    persona16.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4254095E1");
    persona16.setCharacteristicsList(Arrays.asList(true, true, false, true, false, 
    true, false, true, false, false, false, true, false, false, true, true, false, 
    true, true, false, true, false, false, false, true, false, false, true, false, 
    false, false, false, false, false, false, false, false, false, false, true, false,
     true, false, false, true, false, true, false, false, false, false, false, false, false,
     false, false, false, true, true, false, false, 
     false, false, false));

    Persona persona17 = new Persona();
    persona17.setName("RAFAEL MARCELINO DO CARMO SILVA");
    persona17.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4215276Y8");
    persona17.setCharacteristicsList(Arrays.asList(true, true, true, 
    false, false, true, false, false, false, true, true, true, false, 
    false, true, false, false, false, false, true, true, false, false, 
    false, false, true, true, false, false, true, false, false, false, false, 
    false, false, false, false, false, false, false, true, false, false, false, false, 
    false, false, false, false, false, false, true, false, false, false, false, false, false, 
    false, false, false));

    Persona persona18 = new Persona();
    persona18.setName("Sr. CÉSAR");
    persona18.setImgUrl("https://cptstatic.s3.amazonaws.com/imagens/enviadas/materias/materia10578/slide/jardineiro-1-cursos-cpt.jpg");
    persona18.setCharacteristicsList(Arrays.asList(true, true, true, true, 
    false, true, true, false, false, false, false, true, true, true, true, true,
     false, true, false, false, true, false, true, false, false, false, false, false, 
     false, false, false, false, true, true, false, true, false, false, false, true, false, 
     false, false, false, false, false, false, false, false, false, false, false, false, false,
      false, true, false, false, false, false, false, false, false, false, false));

    Persona persona19 = new Persona();
    persona19.setName("Sr. HENRIQUE");
    persona19.setImgUrl("https://cptstatic.s3.amazonaws.com/imagens/enviadas/materias/materia10578/slide/jardineiro-1-cursos-cpt.jpg");
    persona19.setCharacteristicsList(Arrays.asList(true, true, false, true,
     false, true, false, true, false, false, false, false, true, false, 
     false, true, true, false, true, true, false, false, false, true, false, 
     false, false, false, false, false, false, false, false, false, true, 
     false, false, true, false, false, false, false, false, false, false, false, false, 
     false, false, false, false, false, false, false, true, false, false, false, false,
      false, false, false, false, false, false));

    Persona persona20 = new Persona();
    persona20.setName("HENRIQUE");
    persona20.setImgUrl("https://avatars.githubusercontent.com/u/87656464?v=4");
    persona20.setCharacteristicsList(Arrays.asList(true, true, false, 
    false, true, false, false, false, false, false, true, false, false, 
    false, true, false, true, true, false, false, false, false, false,
    false, false, false, false, false, false, false, true, false, false, 
    false, true, false, false, true, false, false, false, false, false, 
    false, false, false, false, false, false, false, false, true, false, 
    true, false, false, false, false, false, false, false, false, false, false));

    Persona persona21 = new Persona();
    persona21.setName("JOÃO PEDRO");
    persona21.setImgUrl("https://avatars.githubusercontent.com/u/87656175?v=4");
    persona21.setCharacteristicsList(Arrays.asList(true, true, true, false, 
    false, true, false, false, false, true, true, true, false, false, true, 
    false, false, false, false, true, true, false, false, false, false, 
    true, true, false, false, true, false, false, false, false, false, 
    false, false, false, false, false, false, true, false, false, false, 
    false, false, false, false, false, false, true, false, false, false, 
    false, false, false, false, false, false));

    Persona persona22 = new Persona();
    persona22.setName("LUCAS FARINELLI");
    persona22.setImgUrl("https://avatars.githubusercontent.com/u/88335981?v=4");
    persona22.setCharacteristicsList(Arrays.asList(true, true, false, 
    true, false, true, false, true, false, false, false, false, true, 
    false, false, true, true, false, true, true, false, false, false, true, 
    false, false, false, false, false, false, false, false, false, 
    false, true, false, false, true, false, false, false, false, false, false, 
    false, false, false, false, false, false, false, false, false, false, 
    true, false, false, false, false, false, false, false, 
    false, false, false, false));

    Persona persona23 = new Persona();
    persona23.setName("FELIPE CAMPOS");
    persona23.setImgUrl("https://avatars.githubusercontent.com/u/77592669?v=4");
    persona23.setCharacteristicsList(Arrays.asList(true, true, false, 
    false, true, false, false, false, false, false, true, false, 
    false, false, true, false, true, true, false, false, false, 
    false, false, false, false, false, false, false, false, false, 
    true, false, false, false, true, false, false, true, false, 
    false, false, false, false, false, false, false, false, false, 
    false, false, false, true, false, true, false, false, false, false, 
    false, false, false, false, false, false));

    Persona persona24 = new Persona();
    persona24.setName("PEDRO HENRIQUE");
    persona24.setImgUrl("https://avatars.githubusercontent.com/u/87656248?v=4");
    persona24.setCharacteristicsList(Arrays.asList(true, true, false, 
    true, false, true, false, true, false, false, false, false, true, 
    false, false, true, true, false, true, true, false, false, false, true, 
    false, false, false, false, false, false, false, false, false, false, true, 
    false, false, true, false, false, false, false, false, false, false, 
    false, false, false, false, false, false, false, false, false, true, false, 
    false, false, false, false, false, false, false, false, false, false));

    Persona persona25 = new Persona();
    persona25.setName("CARAMELO");
    persona25.setImgUrl("https://portalaltadefinicao.com/wp-content/uploads/2024/06/cachorro-caramelo.jpeg");
    persona25.setCharacteristicsList(Arrays.asList(false, false, false, 
    false, false, false, false, false, false, false, false, false, false, 
    false, false, false, false, false, false, false, false, false, false, false, 
    false, false, false, false, false, false, false, false, false, false, false, 
    false, false, false, false, false, false, false, false, false, false, 
    false, false, false, false, false, false, false, false, false, false, false, 
    false, false, false, true, true, false, false, false, false, false));

}