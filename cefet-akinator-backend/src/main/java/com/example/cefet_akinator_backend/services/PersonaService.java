package com.example.cefet_akinator_backend.services;

import com.example.cefet_akinator_backend.model.Persona;
import com.example.cefet_akinator_backend.repository.PersonaRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PersonaService {
    private final Persona persona;
    private final ApplicationContext context;
    private final PersonaRepository personaRepository;

    public PersonaService(Persona persona, ApplicationContext context, PersonaRepository personaRepository) {
        this.persona = persona;
        this.context = context;
        this.personaRepository = personaRepository;
    }

    public List<Persona> populaBanco(){
        List<Persona> personaList = new ArrayList<>();
        Persona persona1 = (Persona) context.getBean(Persona.class);
        persona1.setName("Alberto Pena Lara");
        persona1.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4782120U0");
        persona1.setCharacteristicsList(Arrays.asList(
                true, true, false, true, false, true, false, true, false, false,
                false, true, false, false, false, false, false, true, false, false,
                false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false,
                false, true, true, false, false, false, true, false, false, true,
                false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, true, false));

        Persona persona2 = (Persona) context.getBean(Persona.class);
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

        Persona persona3 = (Persona) context.getBean(Persona.class);
        persona3.setName("ANDRÉ LUIZ MARAVILHA DA SILVA");
        persona3.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4209051Z0");
        persona3.setCharacteristicsList(Arrays.asList(true, true, false,
                true, false, true, true, true, false, false, false, true, false, false,
                false, true, false, true, true, false, false, true, true, false, false, false,
                false, false, false, false, false, false, false, false, true, false, false, false,
                true, false, false, false, false, false, true, false, false, false, false, false, false,
                false, false, false, false, false, true, false, false, false, false, false, false,
                false, false, false, false));

        Persona persona4 = (Persona) context.getBean(Persona.class);
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

        Persona persona5 = (Persona) context.getBean(Persona.class);
        persona5.setName("DANIEL MORAIS DOS REIS");
        persona5.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4201153A5");
        persona5.setCharacteristicsList(Arrays.asList(true, true, true,
                true, false, true, false, false, false, false, false, true, false, false,
                false, true, false, true, true, false, false, false, false, true, true, false,
                false, true, true, false, true, false, false, true, false, false, false,
                true, true, false, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, true, false, false, false,
                false, false, false, false, false, false, false));

        Persona persona6 = (Persona) context.getBean(Persona.class);
        persona6.setName("DIEGO ASCANIO SANTOS");
        persona6.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K2706192E1");
        persona6.setCharacteristicsList(Arrays.asList(true, true, true,
                false, false, true, false, false, false, true, true, true, false, false,
                true, false, false, false, false, true, true, false, false, false, false,
                true, true, false, false, true, false, false, false, false, false, false,
                false, false, false, false, false, true, false, false, false, false, false,
                false, false, false, false, true, false, false, false, false, false, false,
                false, false, false, false));

        Persona persona7 = (Persona) context.getBean(Persona.class);
        persona7.setName("EDUARDO HABIB BECHELANE MAIA");
        persona7.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4709998D9");
        persona7.setCharacteristicsList(Arrays.asList(true, true, true, true,
                false, true, false, true, false, false, false, true, true, true, false,
                true, false, true, true, false, false, false, false, false, false, false,
                false, false, false, false, false, true, true, true, false, false, false,
                true, false, false, true, false, true, true, false, false, false, false,
                false, false, false, false, false, false, false, false, true, false, false,
                false, false, false, false, false, false, false, false));

        Persona persona8 = (Persona) context.getBean(Persona.class);
        persona8.setName("HIGOR ALEXANDRE DUARTE MASCARENHAS");
        persona8.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K8483877U2");
        persona8.setCharacteristicsList(Arrays.asList(true, true, true, true,
                false, true, true, false, false, false, false, true, true, true, true,
                true, false, true, false, false, true, false, true, false, false, false,
                false, false, false, false, false, false, true, true, false, true, false,
                false, false, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, true, false, false, false,
                false, false, false, false, false, false, false, false));

        Persona persona9 = (Persona) context.getBean(Persona.class);
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

        Persona persona10 = (Persona) context.getBean(Persona.class);
        persona10.setName("MICHEL PIRES DA SILVA");
        persona10.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4127909P6");
        persona10.setCharacteristicsList(Arrays.asList(true, true, true,
                true, true, true, true, true, true, false, false, true, true, false,
                false, true, false, true, true, false, false, false, false, false, true,
                false, false, false, false, false, true, false, true, false, true, false,
                true, false, false, false, false, true, true, true, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false));

        Persona persona11 = (Persona) context.getBean(Persona.class);
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

        Persona persona12 = (Persona) context.getBean(Persona.class);
        persona12.setName("THABATTA MOREIRA ALVES DE ARAÚJO");
        persona12.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4358266T5");
        persona12.setCharacteristicsList(Arrays.asList(false, true, false, true,
                false, true, false, true, true, false, true, true, false, false, false, true,
                false, true, true, false, false, true, false, true, false, false, false, false,
                false, false, false, false, false, false, true, false, false, true, false, false,
                true, false, false, false, false, false, false, false, false, false, false, false,
                true, true, false, false, true, false, false, false, false, false, false, false, false,
                false, false, false, false));

        Persona persona13 = (Persona) context.getBean(Persona.class);
        persona13.setName("THIAGO MAGELA RODRIGUES DIAS");
        persona13.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4594848E8");
        persona13.setCharacteristicsList(Arrays.asList(true, true, false, false,
                true, false, false, false, false, false, true, false, false, false, true,
                false, true, true, false, false, false, false, false, false, false, false,
                false, false, false, false, true, false, false, false, true, false, false,
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, false, true, false, true, false, false, false, false, false, false,
                false, false, false, false));

        Persona persona14 = (Persona) context.getBean(Persona.class);
        persona14.setName("THIAGO ALVES DE OLIVEIRA");
        persona14.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4486546Y5");
        persona14.setCharacteristicsList(Arrays.asList(true, true, false, false,
                false, true, true, false, false, false, true, false, false, false, true,
                false, true, true, false, false, false, false, true, false, false, false,
                false, false, false, false, true, true, false, false, false, true, true, false,
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, true, true, false, false, false, false, false, false, false,
                false, false, false, false));

        Persona persona15 = (Persona) context.getBean(Persona.class);
        persona15.setName("BRUNO FERREIRA ROSA");
        persona15.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4262603D6");
        persona15.setCharacteristicsList(Arrays.asList(true, true, false, true,
                false, true, true, false, false, false, false, true, true, true, false,
                true, false, true, true, false, true, false, false, false, false, false,
                false, false, false, false, false, true, false, true, false, false, false,
                true, false, false, false, true, true, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, true, false,
                false, false, false, false, false, false, false, false, false));

        Persona persona16 = (Persona) context.getBean(Persona.class);
        persona16.setName("MIGUEL FERNANDO DE OLIVEIRA GUERRA");
        persona16.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4254095E1");
        persona16.setCharacteristicsList(Arrays.asList(true, true, false, true, false,
                true, false, true, false, false, false, true, false, false, true, true, false,
                true, true, false, true, false, false, false, true, false, false, true, false,
                false, false, false, false, false, false, false, false, false, false, true, false,
                true, false, false, true, false, true, false, false, false, false, false, false, false,
                false, false, false, true, true, false, false,
                false, false, false));

        Persona persona17 = (Persona) context.getBean(Persona.class);
        persona17.setName("RAFAEL MARCELINO DO CARMO SILVA");
        persona17.setImgUrl("http://servicosweb.cnpq.br/wspessoa/servletrecuperafoto?tipo=1&id=K4215276Y8");
        persona17.setCharacteristicsList(Arrays.asList(true, true, true,
                false, false, true, false, false, false, true, true, true, false,
                false, true, false, false, false, false, true, true, false, false,
                false, false, true, true, false, false, true, false, false, false, false,
                false, false, false, false, false, false, false, true, false, false, false, false,
                false, false, false, false, false, false, true, false, false, false, false, false, false,
                false, false, false));

        Persona persona18 = (Persona) context.getBean(Persona.class);
        persona18.setName("Sr. CÉSAR");
        persona18.setImgUrl("https://cptstatic.s3.amazonaws.com/imagens/enviadas/materias/materia10578/slide/jardineiro-1-cursos-cpt.jpg");
        persona18.setCharacteristicsList(Arrays.asList(true, true, true, true,
                false, true, true, false, false, false, false, true, true, true, true, true,
                false, true, false, false, true, false, true, false, false, false, false, false,
                false, false, false, false, true, true, false, true, false, false, false, true, false,
                false, false, false, false, false, false, false, false, false, false, false, false, false,
                false, true, false, false, false, false, false, false, false, false, false));


        Persona persona19 = (Persona) context.getBean(Persona.class);
        persona19.setName("Sr. HENRIQUE");
        persona19.setImgUrl("https://cptstatic.s3.amazonaws.com/imagens/enviadas/materias/materia10578/slide/jardineiro-1-cursos-cpt.jpg");
        persona19.setCharacteristicsList(Arrays.asList(true, true, false, true,
                false, true, false, true, false, false, false, false, true, false,
                false, true, true, false, true, true, false, false, false, true, false,
                false, false, false, false, false, false, false, false, false, true,
                false, false, true, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, true, false, false, false, false,
                false, false, false, false, false, false));


        Persona persona20 = (Persona) context.getBean(Persona.class);
        persona20.setName("HENRIQUE");
        persona20.setImgUrl("https://avatars.githubusercontent.com/u/87656464?v=4");
        persona20.setCharacteristicsList(Arrays.asList(true, true, false,
                false, true, false, false, false, false, false, true, false, false,
                false, true, false, true, true, false, false, false, false, false,
                false, false, false, false, false, false, false, true, false, false,
                false, true, false, false, true, false, false, false, false, false,
                false, false, false, false, false, false, false, false, true, false,
                true, false, false, false, false, false, false, false, false, false, false));

        Persona persona21 = (Persona) context.getBean(Persona.class);
        persona21.setName("JOÃO PEDRO");
        persona21.setImgUrl("https://avatars.githubusercontent.com/u/87656175?v=4");
        persona21.setCharacteristicsList(Arrays.asList(true, true, true, false,
                false, true, false, false, false, true, true, true, false, false, true,
                false, false, false, false, true, true, false, false, false, false,
                true, true, false, false, true, false, false, false, false, false,
                false, false, false, false, false, false, true, false, false, false,
                false, false, false, false, false, false, true, false, false, false,
                false, false, false, false, false, false));

        Persona persona22 = (Persona) context.getBean(Persona.class);
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

        Persona persona23 = (Persona) context.getBean(Persona.class);
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

        Persona persona24 = (Persona) context.getBean(Persona.class);
        persona24.setName("PEDRO HENRIQUE");
        persona24.setImgUrl("https://avatars.githubusercontent.com/u/87656248?v=4");
        persona24.setCharacteristicsList(Arrays.asList(true, true, false,
                true, false, true, false, true, false, false, false, false, true,
                false, false, true, true, false, true, true, false, false, false, true,
                false, false, false, false, false, false, false, false, false, false, true,
                false, false, true, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, true, false,
                false, false, false, false, false, false, false, false, false, false));

        Persona persona25 = (Persona) context.getBean(Persona.class);
        persona25.setName("CARAMELO");
        persona25.setImgUrl("https://portalaltadefinicao.com/wp-content/uploads/2024/06/cachorro-caramelo.jpeg");
        persona25.setCharacteristicsList(Arrays.asList(false, false, false,
                false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, true, true, false, false, false, false, false));
        Collections.addAll(personaList, persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, persona11, persona12,
        persona13, persona14, persona15, persona16, persona17, persona18, persona19, persona20, persona21, persona22, persona23, persona24, persona25);
        return personaList;
    }
}
