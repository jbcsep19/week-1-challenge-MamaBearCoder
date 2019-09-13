import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Game prompt
        System.out.println("Theta Kappa Pi is hosting their annual Back to School Bash.");
        System.out.println("You decide you want to pledge, so you go check it out.");
        System.out.println("You arrive alone. You can enter through the front door, go to backyard, stay outside talking to a friend on the steps, talk to stranger, go home");
        System.out.println("Responses are case sensitive, if an option is uppercase please use uppercase, same with lowercase.");
        System.out.println("Pick: door, backyard, steps, stranger, home");

        String outside = keyboard.nextLine();

        String door = "door";
        String backyard;
        String steps;
        String stranger;

        //pick a way to enter the party
        switch (outside) {
            case "door":
                System.out.println("You walk through the front door. People are everywhere. You can choose to go to the kitchen, or to the living room. Do you chose kitchen, or living room?");
                String inside = keyboard.nextLine();


                //new THIRD TIER switch to inside
                switch (inside) {
                    case "kitchen":
                        System.out.println("You're thirsty. There are only two options: water, or beer. What do you choose?");
                        String kitchen = keyboard.nextLine();


                        //new LAST TIER switch for water or beer
                        switch (kitchen) {
                            case "water":
                                System.out.println("You grab a bottle of water, stay sober, drive people home, become valedictorian, and get into Harvard. Congrats!");
                                break;
                            case "beer":
                                System.out.println("Uh-oh. Your beer was roofied. You got so drunk, you fell off the 3rd floor balcony. You're dead.");
                                break;
                        }
                        break;
                    //new THIRD TIER case for living room
                    case "living room":
                        System.out.println("You enter the living room, and see two groups of people. One group is playing truth or dare., the other is playing drinking games. What do you do: truth or dare, or games?");
                        String living_room = keyboard.nextLine();


                        //switch for FOURTH TIER truth or dare or games
                        switch (living_room) {
                            case "truth or dare":
                                System.out.println("As a new player, you're next. Do you choose truth or dare?");
                                String truth_or_dare = keyboard.nextLine();


                                //new NO MORE CHOICES switch for truth or dare
                                switch (truth_or_dare) {
                                    case "truth":
                                        System.out.println("You're asked who your crush is. You say the person's name, who just happens to be sitting within earshot. He approaches you and says he likes you, too. You leave the oarty together. You date for the rest of college, eventually getting married and having two babies.");
                                        break;
                                    case "dare":
                                        System.out.print("You're dared to put on the host's brother's turtle costume from Halloween and do an interpretive dance. Someone videos you and uploads it to social media. The Athletic Department at your college sees it, and asks you to be part of the spirit squad as the turtle mascot. You accept, and are given a full-ride scholarship for teh rest of your college career. You graduate with very minimal student loans, which you pay off with help from the NFL mascot job you got upon graduation. You die of old age. Congratulations! ");
                                        break;

                                }
                                break;
                            //case for FOURTH TIER drinking games
                            case "games":
                                System.out.println("You are asked to pick the next game. You pick: kings, or beer pong");
                                String games = keyboard.nextLine();


                                //No more answers, you are done
                                switch (games) {
                                    case "kings":
                                        System.out.println("You draw the fourth king and have to drink the middle cup, which is full of a new drink that makes your insides glow. You go home from embarrassment, and later die of radiation poisoning.");
                                        break;
                                    case "beer pong":
                                        System.out.println("You miss the cup and hit your crush on the head. They spark up a conversation, and you find out you have a lot in common. You spend the rest of the night talking. You exchange numbers, and they call you the next day to go skydiving. The parachute doesn't open, and you die.");
                                        break;
                                }

                        }
                        break;
                }
                break;
            //Second tier to the backyard
            case "backyard":
                System.out.println("There is a huge pool where you can swim with swan floaties, and a lawn where you can play a couple of lawn games. Do you swim or play?");
                String back = keyboard.nextLine();


                //switch for third tier  pool or shuffle board
                switch (back) {
                    case "swim":
                        System.out.println("You decide to swim. Do you go into the shallow end, or the deep end?");
                        String swim = keyboard.nextLine();


                        //FOURTH TIER for pool shallow
                        switch (swim) {
                            case "shallow end":
                                System.out.println("You get into the shallow end, and a group wants you to play chicken. Do you play? Y/N");
                                String chicken = keyboard.nextLine();


                                //Last one, answers, shallow game is done
                                switch (chicken) {
                                    case "Y":
                                        System.out.println("You get on the shoulders of a very drunk male who can't keep his balance. You fall off, hitting your head on the side of the pool, and die.");
                                        break;
                                    case "N":
                                        System.out.println("You get on a swan floatie, and spend the rest of the night relaxing, watching the chaos. You get home at a decent hour, and get a good 8 hours of sleep. The next morning you go to brunch with your best friend, who tells you she's pregnant. You spend the rest of the day looking at baby furniture, and decide you are ready to start dating. You get on Tinder, and match with the third guy you see. You meet, fall in love, get a siberian husky, and live happily ever after in the Canadian Rockies.");
                                        break;
                                }
                                break;
                            //case fourth tier for deep
                            case "deep end":
                                System.out.println("When you dive in, you notice a shiny object on the bottom the pool. Do you get it? Y/N");
                                String shiny = keyboard.nextLine();


                                //No more game tier from deep end of pool
                                switch (shiny) {
                                    case "Y":
                                        System.out.println("You swim toward it, and see the pool vent. You notice too late the shiny object is a balloon held by the clown from IT. He grabs you, pulls you in, and you're never seen again.");
                                        break;
                                    case "N":
                                        System.out.println("You picked right. The clown from IT was down there. You enjoy the rest of the party, and live out your life above ground rather than in the sewer.");
                                        break;
                                }
                                break;
                        }
                        break;
                    //THIRD TIER from backyard to play lawn games
                    case "play":
                        System.out.println("There are two games to play: bocce ball, or cornhole. Which do you choose?");
                        String play = keyboard.nextLine();


                        //Fourth tier bocce ball do you go first or second?
                        switch (play) {
                            case "bocce ball":
                                System.out.println("They ask if you want to go first or second. What do you choose?");
                                String order = keyboard.nextLine();


                                //Last tier of bocce ball, no more, this segment of game ends
                                switch (order) {
                                    case "first":
                                        System.out.println("Your aim is off, and the ball goes rolling into the bushes. When you go to retrieve it, you come face to face with a bear. It eats you.");
                                        break;
                                    case "second":
                                        System.out.println("You hit the first player's ball perfectly. Unbeknownst to you, a bocce ball college scout is watching, and offers you a walk-on spot after graduation to the University of Sydney. You accept, move to Australia, and marry a surfer. You eventually die of sun poisoning from not wearing enough sun screen while watching your husband surf.");
                                        break;
                                }
                                break;
                            //Fourth tier for cornhole
                            case "cornhole":
                                System.out.println("You have your pick of partners. Do you choose the jock, or the vampire?");
                                String partner = keyboard.nextLine();


                                //switch for jock or vampire - no more choices for this segment
                                switch (partner) {
                                    case "jock":
                                        System.out.println("You and the jock win your game. You get bored because cornhole is a super boring game, so you go home, watch Netflix, and cuddle with your cat.");
                                        break;
                                    case "vampire":
                                        System.out.print("The vampire bites your nexk instead of playing the game, turning you into a vampire. You live out the rest of your days living in a coffin, looking for other victims. You die when someone drives a stake through your heart in Las Vegas");
                                        break;
                                }
                                break;
                        }

                        //
                        break;
                }
                break;
            //Talk to friend on steps SECOND TIER
            case "steps":
                System.out.println("Your friend is having relationship problems. Do you stay and listen, or excuse yourself and go to the bar? What do you choose: listen or bar?");
                String relationship = keyboard.nextLine();

                //Switch THIRD TIER listen to friend or go to bar
                switch (relationship) {
                    case "listen":
                        System.out.println("Your friend's significant other just found out they have a child from a previous relationship. Your friend doesn't know if they should stay together. Do you tell them they should stay together? Y/N");
                        String stay = keyboard.nextLine();

                        //FOURTH TIER
                        switch (stay) {
                            case "Y":
                                System.out.println("Your friend asks for your help in raising this baby. Will you help? Y/N");
                                String baby = keyboard.nextLine();

                                //switch for NO MORE TIERS, do you help the baby
                                switch (baby) {
                                    case "Y":
                                        System.out.println("Your friend names you the Godparent of the significant other's child. They end up running away to Barbados, leaving the child with you. They don't return. You have to drop out of college to get a job to care for this child. The child grows up to become a billionaire who cures cancer. You win. ");
                                        break;
                                    case "N":
                                        System.out.println("Your friend gets mad at you and storms off. You never talk to them again. You hear through the grapevine they dropped out of college to help care for this child. The child turns out to be a spawn of Satan and kills your friend when a Priest tries to perform an exorcism");
                                        break;
                                }
                                //third tier, you don't listen to your friend, you go to the bar
                                break;
                            // case FOURTH TIER
                            case "N":
                                System.out.println("You tell your friend not to help with the baby and to dump their significant other. They get angry, and storm off. Do you follow them? Y/N");
                                String follow = keyboard.next();

                                //switch No more tiers from they shouldn't be together
                                switch (follow) {
                                    case "Y":
                                        System.out.println("You find your friend crying in the bathroom. You apologize, and say you will figure it out together. They end up staying together, and raising the child as their own. You become the favorite relative. When the child grows up, they buy you a house in Malibu, and you retire with your three dogs, spouse, and opal collection. You eventually die from a shark bite.");
                                        break;
                                    case "N":
                                        System.out.println("You go on with your night, finding an attractive co-ed to talk to. Sparks fly, and by the following week you are fully dating. After a few years, you get married, and move to Minnesota. You buy season tickets to the Vikings, but when you go to your first game you fall down the stairs and break your leg. You eventually die from MRSA. ");
                                        break;
                                }
                                break;
                        }
                        break;
                    case "bar":
                        System.out.println("You tell your friend you need a drink before hearing their story. When you get to the bar do you order a beer or liquor?");
                        String drink = keyboard.nextLine();

                        //Switch FOURTH TIER for the bar
                        switch (drink) {
                            case "beer":
                                System.out.println("You get a beer, and take a seat at the bar. You start flirting with the bartender, who eventually asks for your number. Do you give it to them? Y/N");
                                String number = keyboard.nextLine();

                                //No more tiers, end of line for beer at bar with bartender
                                switch (number) {
                                    case "Y":
                                        System.out.println("You give the bartender your phone number. They use it to stalk you, and hack into all of your accounts. They wipe out your bank accounts, and open credit cards in your name. Your credit score tanks, and you're forced to live at home for the rest of your adulthood. You decide to build yourself bunk beds, and die when it collapses on top of you.");
                                        break;
                                    case "N":
                                        System.out.println("You open up the paper the next day and see the bartender's picture under the headline Serial Killer Charged with Death of Partygoer. You praise God.");
                                        break;

                                }
                                break;

                            //Case FOURTH liqour
                            case "liquor":
                                System.out.println("Your liquor of choice is vodka, but you get distracted before ordering the type you want when a friend asks for a ride home since you're sober. Do you drive them? Y/N");
                                String drive = keyboard.nextLine();

                                //No more tiers for liquor done
                                switch (drive) {
                                    case "Y":
                                        System.out.println("You leave the party, and drive your friend home. They get home safely, and so do you. You live happily ever after.");
                                        break;
                                    case "N":
                                        System.out.println("Your friend ends up driving their car and gets into an accident. You live with the guilt all your life. You become depressed, and move to a secluded cabin the woods to get away from society. Your best friend is a raccoon. You live out the rest of your days with Ramon the Raccoon, playing poker with the mailman.");
                                        break;


                                }
                                break;
                        }
                        break;

                }
                break;


            case "stranger":
                System.out.println("You're talking to someone you are meeting for the first time. They ask if you want to go to their car. You answer: Y/N");
                String car = keyboard.nextLine();

//third tier stranger going to car
                switch (car) {
                    case "Y":
                        System.out.println("Once in the car, they ask if you like to party. Do you say: Y/N");
                        String pill = keyboard.nextLine();

//fourth tier in car you get a pill
                        switch (pill) {
                            case "Y":
                                System.out.println("They offer you a pill. Do you accept? Y/N");
                                String accept = keyboard.nextLine();

                                //NO MORE TIERS ON THIS STRANGER YES PILL
                                switch (accept) {
                                    case "Y":
                                        System.out.println("The stranger turns out to be a narc. They take you to jail, and your parents refuse to pay your bail. you say the wrong thing to your cell mate, and they kill you.");
                                        break;
                                    case "N":
                                        System.out.println("They pat you on the back, and give you $100. You take the money, go home, and invest it into the stock market. You make millions of dollars. You reinvest some money into a startup pharmaceutical company who ends up creating a drug that cures lupus. Congrats!");
                                        break;
                                }
                                break;
                            //case "N" no I don't like to party
                            case "N":
                                System.out.println("You try getting out of the car, but the stranger locks you in. They pull out a gun, and tell you give me all of your money. Do you give them your money? Y/N");
                                String money = keyboard.nextLine();

                                switch (money) {
                                    case "Y":
                                        System.out.println("They take your money, and let you live");
                                        break;
                                    case "N":
                                        System.out.println("They shoot you.");
                                        break;
                                }
                                break;

                        }
                        break;
                    // Case No I won't help with car
                    case "N":
                        System.out.println("You say thanks, but no thanks. Do you offer to get the stranger a drink, or do you leave? Pick: drink or leave");
                        String offer = keyboard.nextLine();

                        //fourth tier
                        switch (offer) {
                            case "drink":
                                System.out.println("After you get the drink, you start chatting and find out they are into witchcraft. Do you keep talking to them? Y/N");
                                String witch = keyboard.nextLine();

                                //NO MORE TIERS no to getting in car
                                switch (witch) {
                                    case "Y":
                                        System.out.println("You become so enthralled with their stories of witchcraft you decide to become a witch, too. Your parents disown you. You can't get a job so you end up homeless on the streets of Portland, eventually dying in a pedestrian accident.");
                                        break;
                                    case "N":
                                        System.out.println("Good. You go on to become a successful not witch. You have a family, and three dogs, and live out in the country in Wyoming.");
                                        break;

                                }
                                break;

                            //fourth tier
                            case "leave":
                                System.out.println("A beach ball hits you on the head from the pool party, and lands in front of you. Do you throw it back? Y/N");
                                String ball = keyboard.nextLine();


                                //no more tiers
                                switch (ball) {
                                    case "Y":
                                        System.out.println("You throw the ball back but forget you have no coordination and fall flat on your face while throwing it. Everyone laughs. A cute co-ed helps you up, and you end up madly in love and live happily ever after");
                                        break;
                                    case "N":
                                        System.out.println("You keep walking the ball, and all the people from the party yelling at you to throw it back. You walk straight to your car, go home, slip on a banana peel in your kitchen, hit your head on the counter, break your neck, and die.");
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
            //go home SECOND TIER
            case "home":
                System.out.println("You get back in your car, and get a phone call from a friend inviting you to a concert across town. Do you go? Y/N");
                String concert = keyboard.nextLine();

                //THIRD TIER go to concert
                switch (concert) {
                    case "Y":
                        System.out.println("You arrive at the concert to find a body laying on the sidewalk. Do you stop and check on it? Y/N");
                        String check = keyboard.nextLine();

                        //FOURTH TIER body on sidewalk
                        switch (check) {
                            case "Y":
                                System.out.println("It turns out it's a dead body. Do you contact police? Y/N");
                                String contact = keyboard.nextLine();

                                //NO MORE TIERS YES TO BODY POLICE YES OR NO
                                switch (contact) {
                                    case "Y":
                                        System.out.println("The police are so thankful that they reward you with $25,000. You use that to pay for the rest of your college, get your degree in pre-law, go to law school to become a prosecutor You live happily ever after");
                                        break;
                                    case "N":
                                        System.out.println("You walk away, but eye witnesses place you at the scene. You are called in for questioning, eventually turning into their main suspect. You flee for the Canada, but get shot by a moose hunter on the way.");
                                        break;
                                }
                                break;

                            //case for not checking body THIRD TIER
                            case "N":
                                System.out.println("You keep walking, and meet your friend inside the concert venue. A club promoter asks if you'd like to go backstage. Do you go? Y/N");
                                String promoter = keyboard.nextLine();

                                // switch fourth tier
                                switch (promoter) {
                                    case "Y":
                                        System.out.println("You meet the opening act, who ask if you want to go on stage with them for one song. Do you say Y/N?");
                                        String song = keyboard.nextLine();

                                        //switch sing song on stage NO MORE
                                        switch (song) {
                                            case "Y":
                                                System.out.println("You start dancing on stage, but trip in your high heels, falling off the stage. You die");
                                                break;
                                            case "N":
                                                System.out.println("You enjoy the concert from the wings, go home, and live happily ever after");
                                                break;
                                        }
                                        break;
                                    //case no backstage FOURTH TIER
                                    case "N":
                                        System.out.println("You watch the concert from the general admission seating. Your friend asks if you want to go to the mosh pit. Do you mosh? Y/N");
                                        String mosh = keyboard.nextLine();
//NO MORE TIERS not going backstage
                                        switch (mosh) {
                                            case "Y":
                                                System.out.println("You are trampled to death.");
                                                break;
                                            case "N":
                                                System.out.println("You watch the concert, go home, and live happily ever after!");
                                                break;
                                        }
                                }
                                break;

                        }
                        break;

                    //Case "N" THIRD TIER to going to concert
                    case "N":
                        System.out.println("You get home, and are hungry. Do you eat or sleep");
                        String hungry = keyboard.nextLine();

                        //FOURTH TIER switch eat or not
                        switch (hungry) {
                            case "eat":
                                System.out.println("Do you make a sandwich, or ice cream?");
                                String make = keyboard.nextLine();
                                switch (make) {
                                    //NO MORE TIERS EAT
                                    case "sandwich":
                                        System.out.println("You make a PB&J, but the knife slips and slits your throat. You die");
                                        break;
                                    case "ice cream":
                                        System.out.println("This begins your addiction to ice cream. You gain so much weight that you can't leave your house. You also develop a love of video games, and start making YouTube videos of you playing. You end up making millions of dollars, and pay for gastric bypass surgery. You live out the rest of your life healthy, happy, and rich.");
                                        break;
                                }
                                break;
                                //case fourth tier you go to bed
                            case "sleep":
                                System.out.println("You go to your room and put on your PJs. Do you go to the bathroom before bed? Y/N");
                                String bathroom = keyboard.nextLine();

                                //DONE DONE DONE
                                switch (bathroom) {
                                    case "Y":
                                        System.out.println("You go in the bathroom, slip on the rug, and die");
                                        break;
                                    case "N":
                                        System.out.println("You get in bed and go off to dream world. You live happily ever after");
                                        break;
                                }
                                break;


                        }
                        break;
                }
        }
    }
}

