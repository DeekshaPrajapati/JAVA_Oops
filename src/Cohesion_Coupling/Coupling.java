package Cohesion_Coupling;

public class Coupling {

    // Coupling= coupling ko top level design me represent karta he, top level design mtlb yak software ko alg alg module
    // me break karna hi top level design hota he.coupling 2 module ke bitch inter-dependency and interaction define karta he.
    // and coupling humesa low hone chiya yadi apko acha software design karna he to.

    // ***************Types of Coupling
    // 1) Content Coupling=   IS coupling ko bad coupling bolte he kuki iska coupling bahut jyda high hota he.
    //  jissa software ke module yak dusra per jyda depend ho jyga. isliya content coupling ko use nhi karte he.

    // 2)Common Coupling = Jab hum same global data ko 2 moduble ki bitch share kiya jata he to usko hum global ya common
    // coupling khte he , ab yadi hum global data me change karege to 2 no module me bhi change hoga.isliya isko use nhi karte he.

    //3)External Coupling = iscoupling me external data formate and communication protocal ko 2 module ke bitch share kiya jata
    // he use hi external coupling khte he.

    //4)Control Coupling= isme 1 module 2 ra module ke flow ko control karta he ussa hi control coupling khte he.

    //5) Stamp Coupling = jis coupling me multiple module same type ke data ko share karte he sko stamp coupling khte he.

    //6)Data Coupling= is coupling me 2 module ke bitch data pass kiya jata he usko data coupling khte he.
    // ya coupling sabse acha coupling hota he , kuki ya low hota he.
}
