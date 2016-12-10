package services.crm.com.mcradio.refactory;

import java.util.ArrayList;
import java.util.List;

import services.crm.com.mcradio.model.Item;

/**
 * Created by Raul on 30/04/16.
 */
public class ItemFactory {
    public static List<Item> getInstance() {
        List<Item> list = new ArrayList<Item>();
        list.add(new Item("Dj Asuna", "México", "Femenino", "De 5 a 8pm los Sábados", "No tengo una canción en especial. prácticamente me gustan todas XD", "Me encanta interaccionar con mis escuchas, amo la MCRadio, soy fan de las pelis de terror y de los anime gore y románticos :p. Mi anime favorito es Inuyasha. Me gusta el color azul. Tengo dos perros. Actualmente estudio mi maestría y trabajo. Mis hobbies son correr, nadar, cantar (aunque rompa los vidrios) y por supuesto ver anime y alguno que otro dorama.", null));
        list.add(new Item("Dj Bot", "Argentina", "Masculino", "De 5 a 8pm los Viernes", "Difícil decisión, supongo que las de turno son \"Shine Days\" y \"Little Braver\" de Girls Dead Monsters y \"I say you say i love you\" de moumoon", "Acerca del Locutor: Soy un amante del Shonen; peleas, acción, huesos rotos, con una buena trama por supuesto, son los ingredientes que no pueden faltar para que un anime pase a ser de mis favoritos, adoro los colores suaves u obscuros, en lo que a deportes respecta, me encanta el basketball y el ajedrez, me encantan los animales, mi casa está llena de mascotas (5 perros, 5 gatos, 1 tortuga, 3 gallos), mis hobbies principales son hacer radio y frikear con mis amigos.", "http://i.imgur.com/c3a693J.png"));
        list.add(new Item("Dj Chokolatito", "", "", "De 5 a 8pm los Martes", "", "", null));
        list.add(new Item("Dj Fullmetal", "Estados Unidos", "Masculino", "De 5 a 8pm los Martes", "Muchas, me gustan casi todos los generos musicales existentes, desde musica clasica hasta heavy metal pasando por 8bits y tonos midi.", "Soy un amante de la cultura asiatca en general, soy un geek de la tecnologia por naturaleza. Y me gusta saber todo sobre todo.", null));
        list.add(new Item("Dj Negima Sekai", "Peru", "Masculino", "De 22pm a 0am los Lunes y Jueves", "Tengo muchas favoritas cuyos interpretes son seiyuus.", "Me encantan los seiyuus, buenas series de anime que traigan ideas únicas y compartir e interactuar con los oyentes sobre un tema determinado. Gracias a MC-Radio pude definir mi carrera profesional (Ciencias de la Comunicación) cuyos conocimientos los comparto con ustedes.", null));
        list.add(new Item("Dj Sniper", "Repúplica Dominicana", "Masculino", "De 5 a 8pm los Domingos", "Samurai Heart(Spyair), RPG (Sekai no Owari)", "Me encanta hablar y dar mi opinión personal de las cosas, en cuanto a mis pasatiempos me gusta el ciclismo de montaña y hacer oficios técnicos, amo los videojuegos y la cultura OTAKU en general.", null));
        list.add(new Item("Dj Trainheart", "Perú", "Masculino", "De 10am a 12pm los Sábados", "Venus Say", "Me encanta la locución, me considero un gran fan del anime, me gusta madrugar (un poco raro eso xD) y bueno amo la McRadio TwT",null));
        list.add(new Item("Dj Zero", "Argentina", "Masculino", "De 3 a 5pm los Miércoles", "Bartender. \"Clover (Ex track)\"", "Empecé el 4/4 de 2007 y desde entonces creo que no paré de mejorar (era horrible en un principio). Últimamente no veo mucho anime, pero estoy por entrar en un \"receso\" que me va a permitir dedicarme un poco más a mi mismo. Amo los videojuegos y soy el feliz propietario de una Nintendo 3DS XL.", "http://mcanimeradio.com/music/images/avatares/DjZeroo.png"));
        list.add(new Item("Dj Zeta", "Argentina", "Masculino", "De 11 a 13pm de Lunes a Viernes", "Lovers del grupo 7!!", "Siempre me gustó el anime y ahora tengo la oportunidad de hablar de lo mejor del anime todos los sabados por la radio, algo que siempre quice hacer. Recién empiezo y solo quiero mejorar como DJ e ir mejorando mis programas. También me gustan muchos los videojuegos y la tecnología.", null));

        return list;
    }
}
