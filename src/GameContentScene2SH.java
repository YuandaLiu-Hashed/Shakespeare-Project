// Scene 2 Sneaky Hamlet Scenario
public class GameContentScene2SH {
    static void build(GameBuilder builder) {
        //----------------------------------------------------------------------
        // 1
        //----------------------------------------------------------------------
        builder.mark("S2SH.1");

        builder.addText("Hamlet and Horatio sneak into the funeral. Hamlet sees a chance to kill Claudius, but Horatio says to be sneaky about it");
        builder.presentAndWait();
        builder.addText("The next day is as chilly as the night before. The trees of the graveyard hang over the heads of the procession that returns to commemorate Ophelia. This time, though, there are many more honors that accompany King Claudius, Queen Gertrude, and Laertes. The priest, attempting to cover his anxiety over the improperness of the occasion, leads mourners in Latin funeral chants. Women follow with flowers, the colors of the beautiful petals contrasting the veiled, downcast faces of those who hold them. Next are the nobility of Denmark, with proud, stoic faces, and behind them people from the town follow solemnly. Whether it is out of curiosity at the tragedy of the day or from sorrow at the death of lovely Ophelia, it is hard to say. But none can deny that there is no joy to be found among the throngs of mourners.");
        builder.presentAndWait();
        builder.addText("Two men in nondescript outfits lower their hats to cover their eyes and fall in with the procession. With the rumbling of hundreds of feet as a cover, they begin to speak to each other in low voices.");
        builder.presentAndWait();
        builder.addText("“It was good of you to procure these clothes, Horatio. We blend in quite well with these common rabble. I wonder if they can grasp the true significance of this funeral...”");
        builder.presentAndWait();
        builder.addText("“The clothes were easily come by, prince Hamlet. And these people know very well of dead Ophelia. She was beloved by the common people for her beauty and grace, and no doubt she is missed most of anyone in the court who should die, for her gentleness with the people of Denmark is not easily forgotten.”");
        builder.presentAndWait();
        builder.addText("“Certainly, she is less easily forgotten than my poor father, the king. At least, by my family and the court. But the true significance of this funeral will not be for the death of Ophelia, but for the death of my father’s killer. We have many an opportunity this day to put my uncle Claudius into a grave of his own.”");
        builder.presentAndWait();
        builder.addText("The funeral procession approaches Ophelia’s open grave. Her casket still rests in the hole the gravediggers unearthed the previous night, but now, as the king and queen and assorted nobility gather around, it is receiving the proper rites.");
        builder.presentAndWait();
        builder.addText("“Come, Horatio,” says Hamlet. “Let us steal away from these mourners. We must act quickly if we are to send Claudius to the hell to which he belongs!” He pulls Horatio out of sight of the crowd behind a tree and points surreptitiously. “Look how far this branch hangs overhead. It stretches from here all the way to where Claudius stands by the open grave. I believe that, though the tree may be strong, the branch is old and dead.” He pushes a sword into Horatio’s hands. “Go now, and climb this tree. We have a chance to bring the dead branch down onto Claudius’s head, making revenge seem like an act of nature! As well it should.”");
        builder.presentAndWait();
        builder.addText("Horatio stares down at the sword in his hands. “I am certain that the branch is strong enough to kill a man with one blow if it were to fall. But this is a hastily-thought of plan, prince; perhaps we ought to give more thought to it?”");
        builder.presentAndWait();
        
        builder.addOption("Try to kill him", "S2SH.2");
        builder.addOption("Wait for another opportunity", "S2SH.3");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 2
        //----------------------------------------------------------------------
        builder.mark("S2SH.2");

        builder.addText("“We must go ahead with it,” declares prince Hamlet. “We may not have another chance so soon to get close to Claudius without revealing ourselves. No doubt he will concoct some scheme to kill me as soon as he learns that I am alive.”");
        builder.presentAndWait();
        builder.addText("“So be it, prince Hamlet. But I would rest easier if we had more time.” Horatio hesitantly ascends the tree and climbs over the crowd to the large branch that hangs over Claudius’s head. Hamlet returns to the crowd to watch and sneaks his way toward the front to witness what will happen.");
        builder.presentAndWait();
        builder.addText("The branch is thick. Claudius will certainly die when it falls on him, but it also presents a problem to chop it down - Horatio finds that the sword is not an ideal implement for doing so. Horatio struggles for a moment before finding a good way to cut it. He goes slowly and carefully, so that he is not heard over the sound of the funeral chants and murmurs of the crowd, and those who do hear him assume that the chopping of his sword is coming from work in the town, or perhaps an out-of-season woodpecker.");
        builder.presentAndWait();
        builder.addText("It is long going, and soon the funeral wraps up. Hamlet grows impatient and looks up at Horatio in the tree. The mourners will be leaving soon, and it will all be for naught...");
        builder.presentAndWait();
        builder.addText("The royals at the side of Ophelia’s grave turn and begin to leave, and Hamlet realizes he needs to act or Claudius will get away. He pushes through the crowd toward the grave and dramatically removes his hat. “Claudius, my mother, Laertes! What occasion is this that brings so much sorrow to us all!”");
        builder.presentAndWait();
        builder.addText("Claudius, Gertrude, and Laertes all look on in shock, and they are not alone. The crowd begins murmuring and oohing and ahing at the return of the presumed-dead prince. Before he can get a response, Hamlet rushes forward and grabs Claudius by the shoulders. “Why are you silent? Whose grave is this? Have I been gone so long I missed the death of someone of great influence? Don’t you want to know where I have been?”");
        builder.presentAndWait();
        builder.addText("The words are for show. Hamlet guides Claudius back to the side of the grave, into the falling path of the branch. He hears a crack, and the branch sags. Almost there...");
        builder.presentAndWait();
        builder.addText("Claudius pushes Hamlet back and eyes him suspiciously. “What has come over you, Hamlet? You suddenly return, you belt these things out, and you push me around? What is your aim?”");
        builder.presentAndWait();
        builder.addText("Crack.");
        builder.presentAndWait();
        builder.addText("The branch falls, bringing several hundred pounds of solid wood down onto the head of... Hamlet. He is killed instantly before the eyes of Claudius and the crowd of hundreds.");
        builder.presentAndWait();
        builder.addText("Claudius stands in shock at the sight. Hamlet’s sudden appearance and death has unnerved him...");
        builder.presentAndWait();

        builder.addOption("Confesses", "S2SH.4");
        builder.addOption("Tries to play it cool", "S2SH.5");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 3
        //----------------------------------------------------------------------
        builder.mark("S2SH.3");

        builder.addText("“I suppose you are right, Horatio,” says Hamlet. “Let us observe the proceedings of poor Ophelia’s funeral and find a more opportune chance to have my father’s revenge upon Claudius. As in all things, cooler heads shall prevail. I thank you for your constant and ever faithful guidance, Good Horatio.”");
        builder.presentAndWait();
        builder.addText("Horatio bows modestly. “All things for my lord and my friend.”");
        builder.presentAndWait();
        builder.addText("The two wait within the crowd for a while, listening to the funerary chants, the wailing, the epitaphs and the words the royals have to say. Claudius speaks on and on about Ophelia’s virtues, speaking for a long time and saying very little. Gertrude gives a beautiful account of poor Ophelia’s life and death. Laertes is overcome with emotion that makes him incoherent but is nonetheless very moving in its genuine nature.");
        builder.presentAndWait();
        builder.addText("After an hour, the royals turn from the side of her grave and proceed out of the cemetery towards the church. The rest of the mourners follow in turn, and Hamlet and Horatio go with them. The church is not far, and as the mourners pack in, Hamlet notices that one of the royals from the front has broken from the procession and rushed around the side of the church.");
        builder.presentAndWait();
        builder.addText("“Look, Horatio. Claudius is breaking with the rest of the mourning party... for who knows what reason? Perhaps his guilty conscience has grown such that he no longer feels honest enough to enter the church. This may be our chance, Horatio. Quickly!”");
        builder.presentAndWait();
        builder.addText("As the procession enters the church, Hamlet and Horatio push their way to the side and sneak away the same way Claudius did. “You go around, Horatio, to hold his mouth so he cannot give away his location or his fate. I shall do the deed.” Hamlet gestures for Horatio to take a roundabout path. Horatio nods, and the plan is put into action.");
        builder.presentAndWait();
        builder.addText("Hamlet stealthily approaches Claudius. He appears to be pacing in the yard, irritable that the funeral of Ophelia is running so long and so tediously. Hamlet watches and spots Horatio, who slinks up behind Claudius and gags him with his hand. Claudius struggles, but he is a much older man. The time to act is now.");
        builder.presentAndWait();
        builder.addText("Hamlet races out, throws away his hat, and draws his sword. Claudius’s eyes go wide as he recognizes his assailant. “I have returned, Claudius. Now shall I return you to your maker, the Devil! This is justice for my father!”");
        builder.presentAndWait();
        builder.addText("The deed is done quickly. Claudius sinks to the ground and moves no more. Hamlet and Horatio look down at him, and a catharsis sinks over them, until Horatio speaks up:");
        builder.presentAndWait();
        builder.addText("“Claudius’s body cannot be found, lord... where can we stow it?”");
        builder.presentAndWait();
        builder.addText("Hamlet looks around. The graveyard is nearby, so perhaps that is the best place to do it...");
        builder.presentAndWait();

        builder.addOption("Bury it in a empty grave", "S2SH.6");
        builder.addOption("Hide it in a tree in the graveyard", "S2SH.7");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 4
        //----------------------------------------------------------------------
        builder.mark("S2SH.4");

        builder.addText("In the heat of the moment, Claudius accidentally confesses. “Young Hamlet appears here, of all places, only to be killed in a bizarre accident... it is as if fate itself is pointing its cold fingers at me for my crime!” Claudius sputters. “The universe will not let me forget that I poisoned my brother to take his throne!”");
        builder.presentAndWait();
        builder.addText("Suddenly, Claudius remembers where he is. He feels the weight of hundreds of eyes upon him, and he shivers. Slowly, he turns around. Gertrude and Laertes’s eyes bore into and through him.");
        builder.presentAndWait();
        builder.addText("Claudius coughs. “What cold weather we have today. This chill is liable to make a man say anything. Why do you two look at me so? I am your king. Do not raise your anger in a place like this over nothing; it disrespects the dead.”");
        builder.presentAndWait();
        builder.addText("A growl builds in Laertes’s throat. “And your deeds tarnish the works of the living Creator.”");
        builder.presentAndWait();
        builder.addText("“You killed my husband?” Gertrude yells. It is not a question. The crowd grows angry with her. She continues: “You killed my husband for his power? You led me on?!”");
        builder.presentAndWait();
        builder.addText("Laertes raises his fist. “Your lying drove king Hamlet to the madness that ended his life... and his madness did the same to my sister! You are responsible for this!” The crowd roars and begins to circle in. The people know Laertes well, and feel for him strongly. “Your reign ends here, tyrant!”");
        builder.presentAndWait();
        builder.addText("With a cry, Laertes and the people set upon Claudius. They tear at his clothing and drag him away to his fate. The mourning procession becomes a mob hell-bent on violent justice. Gertrude remains by Ophelia’s grave as the cemetery empties. She shakes her head, sighs, and kneels down by Hamlet’s body.”");
        builder.presentAndWait();
        builder.addText("“I will rule in Claudius’s place. Rest easy, my son. Your fate was an undeserved tragedy, and you will not soon be forgotten.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 5
        //----------------------------------------------------------------------
        builder.mark("S2SH.5");

        builder.addText("Despite the horrible, unexpected nature of Hamlet’s death, Claudius tries to play it cool. “What an unpleasant way for prince Hamlet to go,” he says, shaking his head and trying not to betray the shakiness in his voice. “After he disappeared on his voyage to England, we feared the worst, thinking that he was dead... but now we find he is alive, only for him to be taken from us so quickly.”");
        builder.presentAndWait();
        builder.addText("Gertrude sniffles, and he continues, secure that he is playing on the right emotions. “This poor boy! We all witnessed his madness, and it only seems to have gotten worse since his return. Did you all see the way he grabbed me and asked incoherent questions? I can only hope heaven will return his sanity. What a shame, that we should mourn two young people today. How quickly do the younger generations pass, to join the ranks of the old or to burn away before their time.”");
        builder.presentAndWait();
        builder.addText("There are solemn nods and “amens” from the crowd, and after Claudius declares his intention to honor Hamlet by burying him next to his father, the mourners disperse.");
        builder.presentAndWait();
        builder.addText("Claudius and his party return to the castle. He is secretly pleased. He had hoped to kill Hamlet on his trip to England, but the satisfaction of seeing his death with his own two eyes was more than worth it...");
        builder.presentAndWait();
        builder.addText("However, when he reaches his chamber, Claudius finds himself in for a nasty shock: standing at the foot of his bed, with one crooked finger outstretched, pointing directly at him, is the spitting image of his dead brother, old king Hamlet!");
        builder.presentAndWait();
        builder.addText("“What- what is the meaning of this?! What phantom are you!” cries Claudius. “Begone, begone! You are dead!” and yet the ghost does not move. It says nothing.");
        builder.presentAndWait();
        builder.addText("Gertrude comes rushing up at the sound of Claudius yelling. “What is it, husband? What makes you yell so?”");
        builder.presentAndWait();
        builder.addText("“Do you not see it? This horrible phantasm in my dead brother’s image?” Claudius gestures to the ghost. But Gertrude does not. There is nothing there.");
        builder.presentAndWait();
        builder.addText("“Oh, my husband...” she wraps him in a hug. “You must be in a shock from seeing young Hamlet die so suddenly today...” She comforts him, but the ghost does not leave.");
        builder.presentAndWait();
        builder.addText("When prince Fortinbras of Norway arrives later with his entourage, he finds a mad king...");
        builder.presentAndWait();

        builder.addOption("Claudius admits to seeing a ghost", "S2SH.8");
        builder.addOption("Claudius freezes up", "S2SH.9");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 6
        //----------------------------------------------------------------------
        builder.mark("S2SH.6");

        builder.addText("“... our best choice is to bury it in an empty grave. After all, who would look for a dead body in a graveyard? Quickly, Horatio,” says Hamlet. “We do not have the time to dig a hole ourselves - we must find one that has already been dug, but not yet filled in.”");
        builder.presentAndWait();
        builder.addText("The two haul Claudius’s body through the cemetery, looking for suitable graves. Unfortunately, none are recent - the graveyard is old, and most of the graves were filled in by people who themselves later had graves dug for them. The day grows late.");
        builder.presentAndWait();
        builder.addText("“It may not be possible to dispose of the body in such a way, lord,” pants Horatio. He shivers in the chilly air of the late afternoon. “Perhaps there are other options..?”");
        builder.presentAndWait();
        builder.addText("“No, Horatio,” Hamlet says firmly. “If we leave the cemetery with the king’s body, we will quickly be found.” He taps his chin. “As much as I loathe to consider it... we do have one more option. There is one grave newly dug which, though the ceremony was most recent, remains uncovered, as the dirty work of covering it was unfitting for the funeral of one so graceful as she who there lies...”");
        builder.presentAndWait();
        builder.addText("Horatio looks at Hamlet. “You do not mean to suggest we bury Claudius with Ophelia!”");
        builder.presentAndWait();
        builder.addText("“It is our only option.” Hamlet sighs. “Let us make it quick... and may Laertes, my mother, and God forgive me.”");
        builder.presentAndWait();
        builder.addText("The two throw Claudius’s corpse into the grave on top of Ophelia’s casket, the flowers that accompany it, and the handfuls of soil deposited by the departed’s closest relatives, and set to work trying to cover it. However, there is only one shovel. Horatio goes to find another while Hamlet sets himself to the dirty work of covering a dirty deed. The work is long, and tiresome. The prince’s hands grow cold and shake as they grip the shovel and transfer soil over the dead.");
        builder.presentAndWait();
        builder.addText("Just as he begins to wonder where Horatio is, Hamlet hears footsteps approaching. “Good Horatio, quickly!” he calls. “Claudius will be discovered if we cannot cover his body within the hour!”");
        builder.presentAndWait();
        builder.addText("There is no reply. Hamlet shuts his mouth and resists the urge to curse. He turns slowly and finds Laertes standing over him. Laertes’s eyes, red from the exhaustion of tears, bore into him.");
        builder.presentAndWait();
        builder.addText("“Oh... Laertes.” Hamlet chuckles nervously. “I am sorry for the pain I have caused you. I have done you many a wrong, and truly, only I am at fault for them-”");
        builder.presentAndWait();
        builder.addText("Laertes does not respond. He is quick and his mouth is set tight as he runs Hamlet through with his sword in lieu of a response.");
        builder.presentAndWait();
        builder.addText("Hamlet slumps over. In his last moments, he realizes that because of him there will be three bodies in the grave instead of one.");
        builder.presentAndWait();
        builder.addText("Laertes looks down at the body of Hamlet, Claudius’s partially-covered corpse, and Ophelia’s casket. He looks away.");
        builder.presentAndWait();
        builder.addText("“Even in this moment where I hoped to mourn on my own... Hamlet still finds a way to invade my misery and augment my anguish.” Laertes grits his teeth and holds back tears. “Perhaps there is a silver lining here. First king Hamlet dies, then Claudius, and now prince Hamlet. That despicable, infighting dynasty has died with them... now I shall make myself king. A good king. One who, upon my soul, swears to do better than the last scheming family, who brought so much strife to Denmark.”");
        builder.presentAndWait();
        
        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 7
        //----------------------------------------------------------------------
        builder.mark("S2SH.7");
        
        builder.addText("“...our best option is to stow Claudius in a tree. See how the trees of the graveyard are tall and broad - and one would think to look for a dead body in the graves of a cemetery, not in the trees above.” Hamlet taps his chin, thinking. “We will need to find the most gnarled old tree, so that we may climb it as easily as possible, and rope.”");
        builder.presentAndWait();
        builder.addText("Horatio blinks. “You really mean to hide Claudius’s body up in a tree, where anyone can see it?”");
        builder.presentAndWait();
        builder.addText("“We have little time, Horatio. Will you help me?”");
        builder.presentAndWait();
        builder.addText("Horatio sighs. “Yes, lord. I will look for rope.”");
        builder.presentAndWait();
        builder.addText("Hamlet hides out of sight behind a suitably tall and wizened tree until Horatio returns. The two quickly figure out that the body is very heavy and cannot simply be carried up the side of the tree, and so they quickly concoct a plan to throw the rope over a large branch, tie the other end around Claudius, and hoist him up. Horatio pulls him up while Hamlet climbs the tree to receive the body on the other end.");
        builder.presentAndWait();
        builder.addText("When Hamlet climbs back down, the two survey the tree. Claudius rests at the top of the tree, and his arms stick out over part of a branch. But there are many branches between Claudius and the ground, so if one were not looking for Claudius (at least, not looking very hard) he would barely be visible.");
        builder.presentAndWait();
        builder.addText("“I don’t know if this will work, lord...” Horatio mutters.");
        builder.presentAndWait();
        builder.addText("“Perhaps not. But Denmark has been in a strange way this last unhappy year... have not dead kings returned as ghosts? Have not wives gone to wed their husbands’ brothers? What, in comparison, is a dead body in a tree to the awful events that have transpired lately? If it does not compare, then let the spectacle throw attention away from the terrible nature of the deed; and if it does, then it shall be dismissed as another wild tragedy in a time and place full of wild tragedies.” Hamlet clears his throat. “But come, good Horatio, and away, before we are discovered and such questions are rendered moot!”");
        builder.presentAndWait();
        builder.addText("The two hurry away to the castle, looking over their shoulders the whole time. Miraculously, they make it without being seen. They enter the throne room to find Gertrude and Laertes discussing something among themselves. Gertrude looks up with astonishment as they enter.");
        builder.presentAndWait();
        builder.addText("“Hamlet, my son! You are alive! We had feared the worst when you did not return from England!”");
        builder.presentAndWait();
        builder.addText("Laertes glowers at Hamlet but says nothing. His eyes glow with bitterness, blaming Hamlet for Ophelia’s death, but as she received the proper rites the hot-blooded rage that consumed him earlier has died down.");
        builder.presentAndWait();
        builder.addText("“Yes, mother, here I am! And glad am I to be back home, in Denmark?” He looks around with a devious look in his eyes. “But where, pray, is my uncle, king Claudius? And where is my dearest Ophelia?”");
        builder.presentAndWait();
        builder.addText("Gertrude frowns. “Oh, Hamlet. Ophelia is dead... she drowned in the river. I can tell you more later, but we just celebrated her funeral. Laertes and I were just discussing where the king is - we have not seen him since then.”");
        builder.presentAndWait();
        builder.addText("“That is most troubling. But fear not, for I, Hamlet, am most willing to help.” He bows grandiosely. “I shall arrange for a party of guards from the castle to search the town for him. We shall find him, mother, worry not.”");
        builder.presentAndWait();
        builder.addText("“Oh, Hamlet.” She smiles and embraces him. Laertes’s frosty demeanor melts slightly at the sight. “It is good of you to take charge. We shall find him soon enough.”");
        builder.presentAndWait();
        builder.addText("Predictably, Claudius is not found - Hamlet is keen enough to redirect the search parties away from Claudius’s body’s true location. With the king missing, Hamlet declares himself prince regent and begins a long and glorious rule over Denmark free from threats, as his enemies mysteriously disappear before they can act against him.");
        builder.presentAndWait();
        builder.addText("Claudius’s body is eaten by birds before the week is up.");
        builder.presentAndWait();

        builder.jumpTo("END");
        //----------------------------------------------------------------------
        // 8
        //----------------------------------------------------------------------
        builder.mark("S2SH.8");

        builder.addText("“I am being haunted!” cries Claudius. “The ghost of my... tragically deceased brother, King Hamlet, has followed me in my every waking moment!” He points next to Fortinbras, where the ghost is staring at him with contempt. “I- I have told everyone of the ghost and no one listens! It follows me day and night and stares at me, saying nothing! It is standing next to you at this very moment, judging me!”");
        builder.presentAndWait();
        builder.addText("Fortinbras looks around. There is no one there. He looks at queen Gertrude sympathetically. “How long has king Claudius been seeing this ghost?”");
        builder.presentAndWait();
        builder.addText("Gertrude frowns. “He has not stopped rambling about his visions since his nephew, the young prince Hamlet, was accidentally killed. There seems to be something at play in his psyche, for the ghost he sees is that of the young Hamlet’s father, the old king.”");
        builder.presentAndWait();
        builder.addText("Fortinbras shakes his head. “A man consumed by grief... poor Claudius. And poor Denmark, too, to have a king wracked by visions of the past.”");
        builder.presentAndWait();
        builder.addText("Claudius snaps at Fortinbras. “Tje ghost is real! It is here in the room with us, can’t you see? Why can’t you see? We aren’t alone!” He raises his fists at the ghost. The ghost stares stoically, unmoved by Claudius’s show.");
        builder.presentAndWait();
        builder.addText("Two soldiers move from Fortinbras’s side to take Claudius by the arms. “What are you doing? I am the king! I am the king, and that phantom is not! The throne is mine, mine!”");
        builder.presentAndWait();
        builder.addText("Fortinbras sighs. “No wonder Denmark has seen such hard times of late. King Claudius has gone mad... the danes can no longer be trusted to manage Denmark. From this day forward shall I take the throne of Denmark in the name of Norway.”");
        builder.presentAndWait();
        builder.addText("Gertrude steps forward, shocked. “But Fortinbras, Claudius has never acted so until recently- surely there is no need to take our Denmark! there must be a reasonable explanation for this!”");
        builder.presentAndWait();
        builder.addText("Fortinbras avoids her gaze. His soldiers fill the room and raise the Norwegian flag and royal coat of arms. “Perhaps, Gertrude, there is a reasonable explanation for Claudius’s madness. But madness is not reasonable- the king of Denmark cannot excuse his own instability to hoard the throne.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 9
        //----------------------------------------------------------------------
        builder.mark("S2SH.9");

        builder.addText("Claudius freezes up. Fortinbras stares at him, staring seemingly straight into his soul, and Claudius finds himself unable to move, or to respond. He opens his mouth and nothing comes out. He clutches the arms of his throne desperately, searching for words to describe the thing that haunts him. But something holds him back.");
        builder.presentAndWait();
        builder.addText("“Well?” demands Fortinbras. “Explain yourself!”");
        builder.presentAndWait();
        builder.addText("And suddenly the ghost is there too, speaking to him at last after its long silence. “Yes, brother!” it cries. “Explain yourself! Explain that your lust for power overcame you, and drove you to commit the sin of Cain!” The ghost approaches Claudius, who stares on in awful, silent horror. “You do not deserve this throne!”");
        builder.presentAndWait();
        builder.addText("The ghost does not stop as it approaches the throne. It walks right up and sits down on the throne, where Claudius is sitting. Claudius shivers as the ghost ignores his presence and enters his body. His eyes roll back, and Claudius is plunged into blackness.");
        builder.presentAndWait();
        builder.addText("Fortinbras takes a step back, and presses his hand to the scabbard of his sword. “Speak, Claudius! What has taken you? What kind of a state is Denmark in?”");
        builder.presentAndWait();
        builder.addText("Claudius clears his throat. “My apologies, Prince Fortinbras. I have been taken by illness of late, and am only recently recovering. My nephew, prince Hamlet, died recently, and it feels that the madness that took him has affected me as well.”");
        builder.presentAndWait();
        builder.addText("Fortinbras relaxes but does not move his hand from his sword. “You speak not like a madman. You certainly act much better than before.”");
        builder.presentAndWait();
        builder.addText("Claudius smiles. “I feel as if a weight has been taken from me. Like my soul has been born anew. I hope this... illness... will continue to pass quickly. Stay awhile if you like; we still need to honor young Hamlet with a funeral, and I would enjoy the security of a strong young leader as yourself to watch over me in the meantime as I recover.”");
        builder.presentAndWait();
        builder.addText("Fortinbras brings his hand away. “Certainly. I shall stay to ensure Denmark recovers in status.”");
        builder.presentAndWait();
        builder.addText("The next week is the funeral. The king stands with his weeping wife over the grave of prince Hamlet, buried in the graveyard near his beloved Ophelia. Fortinbras brings a delegation of Norwegian soldiers in their best finery, who give a show of their military training as part of the funeral. Horatio holds back tears over his friend’s grave. Laertes is stony silent, full of inner conflict.");
        builder.presentAndWait();
        builder.addText("The king looks up and sees young prince Hamlet standing afar, watching him. He is shrouded in pale white robes. He speaks from across the graveyard, but the king hears him as if he were standing right next to him.");
        builder.presentAndWait();
        builder.addText("“You look like Claudius, the killer of my father. But I suspect you are not.”");
        builder.presentAndWait();
        builder.addText("The king nods slightly, such that no one at the funeral sees it as anything out of the ordinary. “I wear Claudius’s body. It is so similar to my own... but Claudius is dead now,” the king says silently. “In his moment of terror, I took command of his body. He is no more... the throne belongs to the rightful king once again.”");
        builder.presentAndWait();
        builder.addText("Young Hamlet’s ghost nods. “I hope the continuation of your reign is fruitful, my father.”");
        builder.presentAndWait();
        builder.addText("“Indeed. Rest well, my son. I have my crown, my wife, and my country once more.”");
        builder.presentAndWait();
        builder.addText("Prince Hamlet smiles and steps behind a tree. He is seen no more. King Hamlet returns the smile in Claudius’s body. The future is bright.");
        builder.presentAndWait();

        builder.jumpTo("END");

    }
}
