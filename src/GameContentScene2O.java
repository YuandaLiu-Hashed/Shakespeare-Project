// Scene 2 Original Scenario
public class GameContentScene2O {
    static void build(GameBuilder builder) {
        //----------------------------------------------------------------------
        // 1
        //----------------------------------------------------------------------
        builder.mark("S2O.1");

        builder.addText("A servant (Osric) arrives");
        builder.presentAndWait();
        builder.addText("After an upsetting night, Hamlet and Horatio return to their quarters at the castle to find Osric the messenger waiting for them. He is flamboyantly dressed and bows deeply as they arrive. He pulls a letter from out of his coat and holds it forth for them to see.");
        builder.presentAndWait();
        builder.addText("“Thank you Osric. You may go,” says Hamlet. He examines the letter and opens it carefully. His eyes scrutinize the writing and narrow when he sees the name signed at the end.");
        builder.presentAndWait();
        builder.addText("“It is from Laertes,” he says, folding the letter away and sniffing. “After our fight last night, he feels the only way to satisfy his pride and his outrageous means of disrespecting Ophelia is to challenge me to a duel. He is a fencing master, and intends to best me with a foil in front of the entire royal court, my mother and treacherous uncle included.”");
        builder.presentAndWait();
        builder.addText("“He couldn’t even deliver the message in person,” Horatio muses.");
        builder.presentAndWait();
        builder.addText("“Laertes is a man of ridiculous extremes. He won’t let go of his grudge once slighted,” Hamlet grumbles. “He is the better duelist, but I think I can handle him just fine. I will...”");
        builder.presentAndWait();

        builder.addOption("Accept", "S2O.4");
        builder.addOption("Reject", "S2O.2");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 2
        //----------------------------------------------------------------------
        builder.mark("S2O.2");

        builder.addText("“...reject Laertes’ challenge!” Hamlet crosses his arms. “I refuse to stoop to the level of one as emotional and petty as he. Laertes will get no satisfaction from me for his trouble.” With a flick of his wrist, Hamlet tosses the letter into the fireplace, where it is quickly returned to ash.");
        builder.presentAndWait();
        builder.addText("“Very well, lord,” Horatio nods. “Perhaps if we act as if nothing is wrong, Laertes will fall into line.”");
        builder.presentAndWait();
        builder.addText("“More than just Laertes, Horatio,” Hamlet replies. “King Claudius was counting on my tragic death at sea, and certainly my disappearance gave him opportunity to arouse worry here in Denmark about my fate. He cannot act surprised at my survival without revealing his treachery; if I act as if nothing has ever been amiss, he will be forced to follow my lead. Thus will I play on the king’s conscience to take control.”");
        builder.presentAndWait();
        builder.addText("“I will give your response to Laertes,” says Horatio.");
        builder.presentAndWait();
        builder.addText("It isn’t long before Horatio comes stumbling back, nursing a bruised ear. Hamlet rushes to him as he enters the room. “Horatio, you’re hurt! What happened?”");
        builder.presentAndWait();
        builder.addText("Horatio smiles weakly. “Laertes did not take your rejection kindly, lord. He was rough with me, but I have a hardy nature. I’ll be okay.”");
        builder.presentAndWait();
        builder.addText("Hamlet clenches his fists. “That Laertes... not only does he see fit to attack myself and dead Ophelia, but now you too? You, Horatio, who are the best of men?” He shakes with rage. “There is only one thing I can do now...”");
        builder.presentAndWait();

        builder.addOption("Kill Laertes at dinner", "S2O.3");
        builder.addOption("Play it cool", "S2O.8");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 3
        //----------------------------------------------------------------------
        builder.mark("S2O.3");

        builder.addText("“...I will kill Laertes tonight at dinner!” Hamlet cries. I will not take his contempt, his slings and arrows, which distract me from my purpose! My dead father turns in his grave every moment that his killer Claudius survives him, and if Laertes wants to persevere in his belligerence while I grapple with my righteous anger, then he will see what happens to those who cross Hamlet the dane!”");
        builder.presentAndWait();
        builder.addText("“...my lord, I am hardy enough to take some hits. I have done so all my life and survived to be the man you see,” says Horatio, looking somewhat uncomfortable. “If it is on my behalf that you bring down Laertes, I say that you have never been a truer friend than now. But do not let your anger on my behalf overcome you... Laertes, true, has acted inappropriately in many ways, but he is guiltless in the death of your father.”");
        builder.presentAndWait();
        builder.addText("Hamlet looks over with an expression of polite disdain. “Horatio, you have a kind heart, and ever am I grateful to have such an all-loving friend. But yours ever was a milder temperament than what is needed to make difficult decisions. And think: is Laertes not the son of the minging Polonius, who conspired to aid my uncle in placing himself upon the throne? The guilt runs deep, Horatio, seeping even into the blood. Laertes has revealed himself by his attacks on me and my company, and I intend to spill the guilt from his veins for all to see.”");
        builder.presentAndWait();
        builder.addText("Horatio mumbles something too low to hear. Hamlet grunts sympathetically and begins to ready himself for the fateful dinner to be held. Though the other members of the court distrust him, his status will not allow him to be excluded from the meal.");
        builder.presentAndWait();
        builder.addText("As he prepares to leave, Hamlet glances next to the door. His sword is laying in its scabbard, thoughtlessly tossed aside in his anger at Laertes’ gesture. If he truly intends to kill Laertes, he will need something to do it with...");
        builder.presentAndWait();

        builder.addOption("Bring the sword to the dining hall to kill Laertes", "S2O.9");
        builder.addOption("Leave the sword, act natural at dinner", "S2O.10");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 4
        //----------------------------------------------------------------------
        builder.mark("S2O.4");

        builder.addText("“...accept the duel and put him in his place.”");
        builder.presentAndWait();
        builder.addText("Horatio nods. “I will let Laertes know.”");
        builder.presentAndWait();
        builder.addText("With everything in place for the duel, Hamlet goes to the throne room to meet Laertes. Laertes is already there, rubbing his sword with a rag. Is it because it is dirty? Why would he need to apply a rag to his foil? It might be nothing, but then again...");
        builder.presentAndWait();
        builder.addText("Horatio stands off to the side, watching with apprehension. King Claudius and Gertrude sit at the back of the room, watching with interest. Gertrude appears somewhat uncomfortable, but Claudius’s gaze is unsettlingly keen. “Hamlet,” he booms, “it is... good... to see you. How fortunate that you survived your trip to England. Not that there was any risk of you not surviving, of course. I hope that your duel with Laertes settles all hostilities between you two, when you survive it. Which you will, because there’s no chance anyone dies because of subterfuge. Haha.”");
        builder.presentAndWait();
        builder.addText("Hamlet raises an eyebrow, but does not linger too long on his uncle’s words. The duel is about to begin.");
        builder.presentAndWait();
        builder.addText("Before things begin, Hamlet raises his voice. “Laertes, give me your pardon. It may be true that in my... madness... I did you great harm. But such was never my intention, and I would rather it were not me who did so, and in doing so did bring you terrible woe.”");
        builder.presentAndWait();
        builder.addText("Laertes gives a grim nod, but his expression does not change. “I am satisfied that you mean what you say. But my honor will only be satisfied through this challenge.”");
        builder.presentAndWait();
        builder.addText("The two contestants eye each other up. Laertes levels his foil and circles Hamlet, testing the air with the thin blade to see Hamlet’s reaction. Hamlet warily takes up a defensive posture.");
        builder.presentAndWait();
        builder.addText("Laertes’ eyes narrow, and his left hand twitches.");
        builder.presentAndWait();

        builder.addOption("Hamlet dodges left", "S2O.5");
        builder.addOption("Hamlet dodges right", "S2O.6");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 5
        //----------------------------------------------------------------------
        builder.mark("S2O.5");

        builder.addText("Thinking quickly, prince Hamlet dodges left...");
        builder.presentAndWait();
        builder.addText("...directly into Laertes’ foil. The prince tenses up as the metal blade cuts his skin and he falls back. Laertes rears back, smiling cockily. This is the revenge he wanted. Hamlet looks down at where he was hit. The clothes over his stomach have been ripped open by a thin line of blood. He touches it and winces. It stings, but the wound is not deep enough to kill. Still, the first point belongs to Laertes.");
        builder.presentAndWait();
        builder.addText("Hamlet raises his sword again and goes in for another round. Laertes seems much calmer for some reason. Clearly, gaining the first touch of the duel on his opponent has boosted his confidence. As they spar, Hamlet glances out of the corner of his eye at the king and queen watching from afar. Gertrude is mildly disappointed, but Claudius’ eyes are filled with deranged joy...");
        builder.presentAndWait();
        builder.addText("With his confidence up, Laertes’ technique falters, and Hamlet scores the second point, slicing Laertes across the breast. Laertes breathes in quickly, but smiles, unperturbed. Hamlet watches his expression, wondering where this unshakable satisfaction is coming from. He breathes in, each breath deeper than before. The air, for some reason, is not coming. Hamlet looks down at his wound. The blood isn’t stopping...");
        builder.presentAndWait();
        builder.addText("As the two duelists begin the third round, Hamlet shakes his head, feeling dizzy. Something isn’t right...");
        builder.presentAndWait();
        builder.addText("In this haze, Hamlet sees Laertes’ left hand twitch.");
        builder.presentAndWait();

        builder.addOption("Dodge left", "S2O.11");
        builder.addOption("Dodge right", "S2O.13");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 6
        //----------------------------------------------------------------------
        builder.mark("S2O.6");

        builder.addText("Thinking quickly, prince Hamlet dodges right...");
        builder.presentAndWait();
        builder.addText("...out of the way of Laertes’ saber. Laertes gasps as his sword is forced out of the way, and in this opening Hamlet slices at his stomach. The first point is the prince’s.");
        builder.presentAndWait();
        builder.addText("Laertes frowns and looks down at the blood seeping through the scratch in his fine clothes. He shakes his head and gears up for round two. Hamlet smiles. Perhaps he has a chance against this master swordsman.");
        builder.presentAndWait();
        builder.addText("Before the next round, Hamlet glances over at the king and queen over on their thrones. Gertrude smiles and claps politely for him, but Claudius is stoic. Even so, Hamlet easily reads the cold resentment in his eyes.");
        builder.presentAndWait();
        builder.addText("The second round begins, and Laertes and Hamlet circle each other, searching for openings in the others’ defenses. After a few moments of testing the air, Laertes’ left hand twitches again, and he lunges forward. His blade makes contact not with Hamlet but with the prince’s blade, and the sword is thrust away from him. Metal slices across Laertes’ stomach, and Hamlet smiles. The second point is his.");
        builder.presentAndWait();
        builder.addText("Now queen Gertrude is actively, if subduedly, smiling. King Claudius, on the other hand, is seething. The hand with which he grips a goblet of wine (which, oddly, he never seems to drink from) shakes with rage.");
        builder.presentAndWait();
        builder.addText("Hamlet turns to say something to Horatio between rounds while there is no risk. But something feels off... perhaps something about the goblet Claudius is holding?");
        builder.presentAndWait();

        builder.addOption("Watch Claudius for suspicious activity", "S2O.7");
        builder.addOption("Return to the duel", "S2O.12");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 7
        //----------------------------------------------------------------------
        builder.mark("S2O.7");

        builder.addText("Hamlet warily eyes his uncle upon the throne. Gertrude seems oblivious to the cup in Claudius’s hands, but Hamlet is keenly aware of the way that Claudius’s lips never meet the rim of the cup-");
        builder.presentAndWait();
        builder.addText("Suddenly, Hamlet feels the point of a blade ripping through his skin, and he cries out and drops his foil in surprise. He reels back and whirls around. Laertes is upon him like a man possessed, trying to hack at Hamlet, but the prince drives him back.");
        builder.presentAndWait();
        builder.addText("“Laertes, you scoundrel!” Hamlet cries. “You dare attack me out of turn!” He falls on Laertes, surprising the other duelist with his unarmed attack. The duel becomes a lawless brawl as the two contestants roll across the floor, grappling with each other. Hamlet yanks Laertes’s sword from his hands and slashes him across the heart. Laertes looks down in line of blood peeking through his clothes.");
        builder.presentAndWait();
        builder.addText("Hamlet stands up triumphantly and rubs his head. The tussle has made him slightly dizzy for some reason...");
        builder.presentAndWait();
        builder.addText("“Stand, scoundrel! The duel is not yet won!”");
        builder.presentAndWait();
        builder.addText("Laertes scoffs. “So you say, Hamlet.”");
        builder.presentAndWait();
        builder.addText("From the side, King Claudius calls out. “Easy, noble duelists! This duel was intended to put aside your rivalry, not intensify it.” The savage gleam in his eyes belies his calming words. He lifts his goblet aloft. “Noble Hamlet, come hither and have a drink. Renew your senses before the duel continues.”");
        builder.presentAndWait();
        builder.addText("Hamlet narrows his eyes. Claudius is offering the goblet he never touched...");
        builder.presentAndWait();

        builder.addOption("Queen Gertrude takes the chalice", "S2O.14");
        builder.addOption("Hamlet accepts the drink", "S2O.15");
        builder.addOption("There’s a mixup...", "S2O.17");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 8
        //----------------------------------------------------------------------
        builder.mark("S2O.8");

        builder.addText("“...is to remain calm. Laertes no doubt seeks to enrage me by his actions, but this bull is easily sidestepped... too easily does he reveal his inner character, to think that all people would be as easily provoked as he. I have made it this far; let my course remain steady on these rocky seas.”");
        builder.presentAndWait();
        builder.addText("“...well put, my friend,” says Horatio. “I shall be nearby during the dinner. If you should need me, just call into the hall and I will be there to aid you. Good luck, my lord.”");
        builder.presentAndWait();
        builder.addText("“Thank you, Horatio. Never will there be a truer friend than yourself.” Hamlet warmly claps Horatio on the back and heads through the door to dinner.");
        builder.presentAndWait();
        builder.addText("Hamlet walks to the grand hall for his meal. The room is lavishly set up, and Laertes, Gertrude, and Claudius are already there, eating and being attended to by servants. They stare at Hamlet as he pushes the heavy door open and grins at them. “It is good to be back,” he declares to his awkward onlookers. “And I am sure you will want to hear all about my trip to England!”");
        builder.presentAndWait();
        builder.addText("Silence. After a moment, Gertrude coughs into her sleeve. “Certainly, my son,” she says. “You were gone so long that we feared the worst.”");
        builder.presentAndWait();
        builder.addText("“Ah, but the worst is yet to come, mother! It has ever been so, that the future is where all of our miseries truly lie in wait for us.” He does not lose his grin as he marches over to the table and roots around for his spot. There are not enough places set for him, so he calls a servant over to make up his seat.");
        builder.presentAndWait();
        builder.addText("He sits down. The table is silent. Gertrude is looking at nothing in particular, wearing a forced smile. Claudius is staring down into his food. Laertes is staring daggers at Hamlet.");
        builder.presentAndWait();
        builder.addText("“What a pleasant evening this is,” Hamlet observes. “Now that we’re all back together.”");
        builder.presentAndWait();

        builder.addOption("Claudius makes a move", "S2O.18");
        builder.addOption("Laertes makes a move", "S2O.19");
        builder.addOption("Calm dinner", "S2O.20");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 9
        //----------------------------------------------------------------------
        builder.mark("S2O.9");

        builder.addText("Hamlet picks up the sword, gives it a once over, and decides to bring it to  the dining hall to kill Laertes. He nods at Horatio before leaving. His friend looks away. This can only end badly.");
        builder.presentAndWait();
        builder.addText("Hamlet walks to the grand hall for his revenge. The room is lavishly set up, and Laertes, Gertrude, and Claudius are already there, eating and being attended to by servants. They stare at Hamlet as he pushes the heavy door open and grins at them. “It is good to be back,” he declares to his awkward onlookers. “And I am sure you will want to hear all about my trip to England!”");
        builder.presentAndWait();
        builder.addText("Silence. Hamlet continues forward, not waiting for their response. “Are you enjoying your meal, Laertes? I should hope so. It looks delicious. Might I have some?”");
        builder.presentAndWait();
        builder.addText("Laertes regards him with cold suspicion. His expression changes to one of alarm when he looks down and sees the weapon Hamlet holds at his side. He leaps out of his chair and faces Hamlet wordlessly.");
        builder.presentAndWait();
        builder.addText("Hamlet checks the table. “Ah, I see that my seat at the table has no plates! What a shame.” He licks his lips. “I will just have to take yours, Laertes!”");
        builder.presentAndWait();
        builder.addText("The mad prince lunges forwards towards the terrified Laertes...");
        builder.presentAndWait();

        builder.addOption("Hamlet kills Laertes", "S2O.21");
        builder.addOption("Laertes avoids him", "S2O.22");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 10
        //----------------------------------------------------------------------
        builder.mark("S2O.10");

        builder.addText("Hamlet shakes his head and leaves the sword. There will be subtler opportunities to get revenge on Laertes at dinner...");
        builder.presentAndWait();
        builder.addText("Hamlet leaves Horatio and walks to the grand hall for his meal. The room is lavishly set up, and Laertes, Gertrude, and Claudius are already there, eating and being attended to by servants. They stare at Hamlet as he pushes the heavy door open and grins at them. “It is good to be back,” he declares to his awkward onlookers. “And I am sure you will want to hear all about my trip to England!”");
        builder.presentAndWait();
        builder.addText("Silence. After a moment, Gertrude coughs into her sleeve. “Certainly, my son,” she says. “You were gone so long that we feared the worst.”");
        builder.presentAndWait();
        builder.addText("“Ah, but the worst is yet to come, mother! It has ever been so, that the future is where all of our miseries truly lie in wait for us.” He does not lose his grin as he marches over to the table and roots around for his spot. There are not enough places set for him, so he calls a servant over to make up his seat.");
        builder.presentAndWait();
        builder.addText("He sits down. The table is still dead awkward. Gertrude is looking at nothing in particular, wearing a forced smile. Claudius is staring down into his food. Laertes is staring daggers at Hamlet.");
        builder.presentAndWait();
        builder.addText("“What a pleasant evening this is,” Hamlet observes. “Now that we’re all back together.”");
        builder.presentAndWait();
        builder.addText("A servant brings a plate of food over for Hamlet. It does not look particularly appetizing, but it seems the servant brought a knife with him...");
        builder.presentAndWait();

        builder.addOption("Use the knife to kill Laertes", "S2O.23");
        builder.addOption("Something about the food...", "S2O.24");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 11
        //----------------------------------------------------------------------
        builder.mark("S2O.11");

        builder.addText("Thinking quickly, prince Hamlet dodges left...");
        builder.presentAndWait();
        builder.addText("...back into Laertes’ foil. He curses at his mistake and reels back, shuddering. In addition to his first injury, which is still bleeding as freshly as when it was first opened, Hamlet now bears another. This one is much deeper than before. He looks down into his gouged flesh and feels dizzy...");
        builder.presentAndWait();
        builder.addText("He picks up his sword for another go around, but the room seems to go around him, swimming and spinning. He falls to one knee and gasps for air. In the distance, he hears Gertrude gasp and run over to him, but by the time she reaches him he can no longer feel her touch. Numb all over, bleeding out, poison swimming through his veins, Hamlet sinks to the floor and breathes his last.");
        builder.presentAndWait();
        builder.addText("Laertes looks over at Claudius, who is holding in his glee as well as he won’t. Gertrude holds her son’s body and begins to sob.");
        builder.presentAndWait();
        builder.addText("Thus ends the life of Prince Hamlet the dane, who challenged a superior swordsman and lost.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 12
        //----------------------------------------------------------------------
        builder.mark("S2O.12");

        builder.addText("Hamlet shakes his head and turns around. Now is not the time to worry about Claudius, he thinks, with a duel on the line.");
        builder.presentAndWait();
        builder.addText("He does not get through his thoughts. He turns just in time to see Laertes lunging at him out of turn! He quickly sidesteps his assailant. A look of surprise touches Laertes’s face as he sails past Hamlet, who in one swift move swipes the foil out of his hand and trips him. Laertes hits the ground hard and stays there with the wind knocked out of him. Hamlet looks down and sneers.");
        builder.presentAndWait();
        builder.addText("“Did you think you could trick me, Laertes? I know what kind of a snake you are... you were never subtle. Your blubbering at Ophelia’s funeral proves that much.”");
        builder.presentAndWait();
        builder.addText("Laertes looks up and snarls at Hamlet. He futilely fumbles around for his sword, but Hamlet kicks it away and kicks him in the stomach. He doubles over, lying on the ground.");
        builder.presentAndWait();
        builder.addText("From her throne, Queen Gertrude’s face grows red. “A cheat! How could Laertes act so shamefully to attack my son out of turn.”");
        builder.presentAndWait();
        builder.addText("Claudius looks somewhat embarrassed. “Such is how things go in the heat of battle,” he says, wiping sweat off of his brow. “As a woman, I would not expect you should understand the passion the duel elicits... it is best to let Laertes retrieve his sword and have the duel continue...”");
        builder.presentAndWait();
        builder.addText("Gertrude rolls her eyes. “Oh, good grief. You men are insufferable in these affairs. I grow tired. Give me that.” She snatches the goblet from Claudius’s hands to take a drink.");
        builder.presentAndWait();

        builder.addOption("Gertrude refreshes herself", "S2O.27");
        builder.addOption("Claudius knocks the goblet from her hands", "S2O.26");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 13
        //----------------------------------------------------------------------
        builder.mark("S2O.13");

        builder.addText("Thinking quickly, prince Hamlet dodges right...");
        builder.presentAndWait();
        builder.addText("...out of the way of Laertes’ saber. Laertes gasps as his sword is forced out of the way, and in this opening Hamlet forces the sword out of his hand. He curses and reels back, shuddering. “Oh no,” he whispers.");
        builder.presentAndWait();
        builder.addText("Hamlet smiles sleepily. The room is turning around him like a dream, but he has a point on Laertes. Without thinking, and before Laertes can process what he is doing, he rushes and grabs Laertes’s foil from off of the ground. He chuckles and hefts a sword in each hand.");
        builder.presentAndWait();
        builder.addText("“Lay on, Laertes!” Hamlet cries.");
        builder.presentAndWait();
        builder.addText("Laertes flees from Hamlet’s double-bladed assault, but the prince is faster. He lays into him, cutting at him with both his own and Laertes’s blade.");
        builder.presentAndWait();
        builder.addText("From the sidelines, Claudius has gone as pale as a ghost. Gertrude gasps. “My son, you have fallen too deep into your madness! You must stop!”");
        builder.presentAndWait();
        builder.addText("Hamlet drops his swords. Laertes has been sufficiently bloodied. He looks down at the wounds from his own sword in horror and keels over. Funny, the injuries weren’t that deep. He should be fine...");
        builder.presentAndWait();
        builder.addText("Then again, Hamlet thinks, he did do a lot to him. And come to think of it, Laertes hadn’t wounded him so badly either, and he didn’t feel so well.");
        builder.presentAndWait();
        builder.addText("Hamlet collapses next to Laertes. His eyes flicker over to Claudius on his throne before closing for the last time. “My father’s killer survives...” he whispers for no one to hear.");
        builder.presentAndWait();
        builder.addText("Gertrude rushes over in shock and checks Hamlet’s pulse.");
        builder.presentAndWait();
        builder.addText("“My son... he’s dead! Prince Hamlet is dead! ...and so is Laertes! They killed each other!” She sobs as servants arrive to try and take the bodies away. Horatio, at the side of the throne room, is in a shell-shocked silence.");
        builder.presentAndWait();
        builder.addText("Claudius stands and addresses the court. “This is truly a tragedy, that prince Hamlet should have taken chancellor Polonius’s only son and last surviving child Laertes from us in his madness... a madness that is, of course, a tragedy in itself. But such is what happens when foolhardy young men get their tempers up. It is for the old to survive them and honor their memories, while warning against their mistakes.” He shakes his head. “We shall hold a proper funeral for the two of them and continue on. Perhaps, at last, the suffering that has taken over our Denmark shall come to a close.”");
        builder.presentAndWait();
        builder.addText("He bows his head solemnly as Gertrude weeps for her son, but looks away and smiles. “With Hamlet and his killer dead, all of my loose ends have been tied up... now is Denmark fully in the palm of my hand!”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 14
        //----------------------------------------------------------------------
        builder.mark("S2O.14");

        builder.addText("While Claudius is holding the goblet aloft, Gertrude takes it from him. “Yes, son. Come over and have a drink. It is okay to rest.” She glances at the chalice. “I’ll share it with you, if that’s alright.” She lifts the cup to her mouth. Hamlet cocks his head.");
        builder.presentAndWait();
        builder.addText("“No, Gertrude!” Claudius cries. But it is too late. Gertrude drinks from his chalice and wipes her mouth. She blinks and looks at Claudius in confusion. He cringes back in his throne. Gertrude’s vision begins to swim, and she slumps back in her chair...");
        builder.presentAndWait();
        builder.addText("Hamlet looks on in horror as his mother’s life is sapped away, mere moments after drinking from Claudius’s cup. He gasps, feeling the wound on his body that, for some reason, still has not closed, and feels himself growing fainter every moment...");
        builder.presentAndWait();
        builder.addText("“...Mother?” He cries out. She does not respond. Claudius resembles his brother’s ghost more and more every moment, pale as he is at the shock of Gertrude drinking the wine meant for Hamlet.");
        builder.presentAndWait();
        builder.addText("Laertes, from his place on the ground, coughs, feeling his own wound. Hamlet  whirls back and looks at him. “What was that? Have you something to say, Laertes?”");
        builder.presentAndWait();

        builder.addOption("Laertes tells the truth about the poison plot", "S2O.28");
        builder.addOption("Laertes dies without revealing the truth", "S2O.29");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 15
        //----------------------------------------------------------------------
        builder.mark("S2O.15");

        builder.addText("Hamlet accepts the drink with a grunt and walks over to meet Claudius. He does not trust Claudius, but letting down his guard to scrutinize him was what let Laertes catch him by surprise with his attack. While Laertes is the immediate threat, he can’t afford to be suspicious of his father’s killer.");
        builder.presentAndWait();
        builder.addText("Claudius and Gertrude smile at Hamlet as he takes the chalice and drinks deeply. The wine is sweet, but has a nutty, bitter aftertaste. He wipes his mouth and turns to face Laertes again. But when he tries to lift his sword, he finds he cannot raise it. All of the strength in his arm is gone.");
        builder.presentAndWait();
        builder.addText("Come to think of it, Hamlet realizes his strength is rapidly leaving him. As everything goes dark, he turns to look at Claudius and sees the devil in his eyes. “Why, you...” are his last words as he collapses and the spark of life leaves him.");
        builder.presentAndWait();
        builder.addText("Gertrude gasps as her son dies before her very eyes. “Oh, God! Prince Hamlet!” She leaps out of her chair and cradles Hamlet’s body, desperately checking for breath or signs of a pulse. She finds none. “Oh, my son! He’s dead!”");
        builder.presentAndWait();
        builder.addText("Claudius stands from his throne and looks Hamlet over, feigning concern but secretly reveling in joy. His plot to off Hamlet has succeeded, and nothing stands in his way now. He looks over at Gertrude. As long as he can pass this off as tragedy, his power will stand unopposed.");
        builder.presentAndWait();
        builder.addText("He puts his hand on her shoulder and opens his mouth...");
        builder.presentAndWait();

        builder.addOption("Claudius reassures Gertrude", "S2O.30");
        builder.addOption("Laertes interrupts him first", "S2O.16");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 16
        //----------------------------------------------------------------------
        builder.mark("S2O.16");

        builder.addText("Before Claudius can speak falsehoods to Gertrude, Laertes, from where he lays bleeding out, cries out. “A word, your majesty!”");
        builder.presentAndWait();
        builder.addText("Claudius looks up. “What is it, Laertes? Are you well?” He asks, knowing full well that Laertes will die from his poisoned blade.");
        builder.presentAndWait();
        builder.addText("Laertes coughs. “Not you, king Claudius - my words are for the queen!”");
        builder.presentAndWait();
        builder.addText("Gertrude looks up in a mourning rage. “What can you possibly say to me, you who killed my son?!”");
        builder.presentAndWait();
        builder.addText("The dying duelist shakes his head. “It is true that I killed prince Hamlet, and very well meant to in my heart... but seeing your grief, I realize that my mistake comes at your happiness. The truth is, my sword was not enough to kill the prince on its own. I poisoned my blade, on the order of your husband, Claudius!”");
        builder.presentAndWait();
        builder.addText("“Hold your tongue, boy!” Claudius hisses. “Gertrude, he does not know what he says!”");
        builder.presentAndWait();
        builder.addText("Gertrude looks between Laertes and Claudius in shock as Laertes goes on. “I owe you nothing more, king Claudius! With your poison upon my blade I poisoned Hamlet in the course of our duel, and he in turn used it against me. My time is almost up because of Claudius’s orders!” He coughs. His phlegm is turning red. “What’s more, it was not the poison on my blade that killed prince Hamlet - it was the poison in the chalice the king proffered!”");
        builder.presentAndWait();
        builder.addText("Gertrude turns her eyes to the ground, where the goblet lies, having fallen from Hamlet’s cold hands. She turns her gaze upon Claudius, who shivers under her anger. “Laertes, do you tell me the truth?”");
        builder.presentAndWait();
        builder.addText("Laertes is growing weaker by the moment. “Upon my honor, I do.”");
        builder.presentAndWait();
        builder.addText("Horatio rushes forward from the sidelines to see to Laertes. He cradles his head. “Laertes, with your honesty you prove that your honor was never in question. Rest easy, lord.”");
        builder.presentAndWait();
        builder.addText("Laertes nods weakly and goes slack. Horatio looks up. Claudius looks away. All eyes are on the queen.");
        builder.presentAndWait();
        builder.addText("“Guards!” She cries. “Have the king arrested and thrown to the dungeon! His treachery has killed my son Hamlet, Laertes, and who knows who else!”");
        builder.presentAndWait();
        builder.addText("At that moment, there is a clattering at the door. The heavy doors are flung open, and in, with his finery and his personal guard, marches prince Fortinbras of Norway. He and his entourage look around at the chaos and dead bodies in the court.");
        builder.presentAndWait();
        builder.addText("“I expected a warmer welcome than this...” the prince intones. “What on Earth has happened here?”");
        builder.presentAndWait();

        builder.addOption("Claudius speaks out", "S2O.31");
        builder.addOption("Gertrude asserts herself", "S2O.32");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 17
        //----------------------------------------------------------------------
        builder.mark("S2O.17");

        builder.addText("Hamlet warily approaches the king for a drink, but when he gets there, he nods his head back towards Laertes. “My king, Laertes would have words with you.”");
        builder.presentAndWait();
        builder.addText("Claudius tilts his head and glances at Laertes, suspicious of the timing. “Surely it can wait.”");
        builder.presentAndWait();
        builder.addText("However, the momentary distraction is all that is needed. While the king looks over to Laertes, Hamlet quickly nabs his goblet and exchanges it with another nearby. He examines his new goblet and replies, feigning unconcern. “So be it. I need to be back to my duel anyway.” He downs the contents of the chalice with approving nods from Gertrude and a brief, wicked smile from Claudius.");
        builder.presentAndWait();
        builder.addText("Hamlet wipes his mouth and returns to the duel. He is slightly dizzy, but the drink did in fact refresh him. Laertes eyes him up and down, looking for openings. He seems slightly confused that Hamlet is in fact refreshed...");
        builder.presentAndWait();
        builder.addText("Suddenly, there is a clatter from the throne and Gertrude gasps. Claudius is gasping, too, as he claws at his throat and turns pale. The goblet at his side has been knocked over onto the floor as Claudius panics and screams for air. He grows weak and finally keels forward out of his throne and onto the floor in an unkingly mess. His eyes bug out, his hands twitch, and then he is still.");
        builder.presentAndWait();
        builder.addText("Gertrude clutches her hands to her chest. “Oh God! King Claudius!” She claps him on the cheek in desperation. “Oh, my husband! He is dead!”");
        builder.presentAndWait();
        builder.addText("Hamlet and Laertes turn from their duel and look on in surprise. They exchange a glance - both seem to know more about this than they are letting on...");
        builder.presentAndWait();

        builder.addOption("Hamlet reveals the truth", "S2O.33");
        builder.addOption("Laertes pipes up", "S2O.34");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 18
        //----------------------------------------------------------------------
        builder.mark("S2O.18");

        builder.addText("Claudius makes a move.");
        builder.presentAndWait();
        builder.addText("As Hamlet is behaving concerningly normal, Claudius is terrified that his plan might not come to fruition. He will have to think fast; even though everybody is distrustful of Hamlet, if he continues to behave normally, people might forget his brief stint of madness.");
        builder.presentAndWait();
        builder.addText("“So, Hamlet, what became of your friends Rosencrantz and Guildenstern? We haven’t seen them around recently, and with you having regained your sanity, maybe they can enlighten us as to what happened on board the ship.”");
        builder.presentAndWait();
        builder.addText("Hamlet, extremely worried that the dinner party might discover what he did to his friends, attempts to defuse the situation. He will only need a few days to dispose of Claudius, so any excuse will suffice.");
        builder.presentAndWait();
        builder.addText("“I really have no idea where they could have gone to, perhaps they weren’t feeling well after their long stay at sea. There are some people who don’t develop their sea legs at all, and they were among them. I suppose they are just resting.”");
        builder.presentAndWait();
        builder.addText("“Nonsense, I invited them myself. I should send some servants to their quarters right now and fetch them hither, just to quickly greet them after their long voyage. I assumed that they would be loyal to their king and come to dinner tonight, but apparently not.”");
        builder.presentAndWait();
        builder.addText("Hamlet, seeing an opportunity to potentially overthrow Claudius right now, exclaims:");
        builder.presentAndWait();
        builder.addText("“They were certainly loyal to you, my liege. In fact, the letter you sent with them instructed them to send my death warrant to the English upon landing. I had to dispose of them myself, to foil your-”");
        builder.presentAndWait();
        builder.addText("Claudius cuts him off, as the entire table simultaneously loses their composure.");
        builder.presentAndWait();
        builder.addText("“You killed Rosencrantz and Guildenstern? Your dearest friends? Surely he is mad, I wrote no such letter. His insanity must have led him to believe in some grand conspiracy against him, which is clearly preposterous. Guards! Seize Hamlet and throw him in jail!”");
        builder.presentAndWait();

        builder.addOption("Hamlet goes peacefully", "S2O.35");
        builder.addOption("Hamlet tries to kill Claudius", "S2O.36");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 19
        //----------------------------------------------------------------------
        builder.mark("S2O.19");

        builder.addText("Laertes makes a move.");
        builder.presentAndWait();
        builder.addText("Laertes breaks the silence. “How dare you decline my challenge?” He asks. Hamlet, still smiling, responds “I wouldn’t have dreamt of accepting it - I know the pain you are feeling, as I’m feeling it ten-fold, you’ll see reason soon.”");
        builder.presentAndWait();
        builder.addText("Laertes rises from the table. “That you could sit there so smug, after losing her, shows me I could never forgive you.” Laertes grabs his knife from the table and begins rounding the table towards Hamlet.");
        builder.presentAndWait();
        builder.addText("Gertrude gasps, but Claudius puts his arm in front of his wife, allowing Laertes to move towards Hamlet - knife raised. As he gets within arms length, Hamlet...");
        builder.presentAndWait();

        builder.addOption("Hamlet defends himself", "S2O.37");
        builder.addOption("Hamlet lets Laertes attack him", "S2O.38");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 20
        //----------------------------------------------------------------------
        builder.mark("S2O.20");

        builder.addText("While Hamlet is acting normally, Laertes is frightened. It’s been difficult to read what Hamlet might do, and this can’t be a good sign at all. He ushers a guard over and asks him if Hamlet has any weapons on him. The guard replies:");
        builder.presentAndWait();
        builder.addText("“No, we checked him and he doesn’t have anything that could cause any harm to anybody at the table, but we don’t know what he could be capable of.”");
        builder.presentAndWait();
        builder.addText("Laertes thanks the guard and returns to his meal. He notices Hamlet eating as well, talking to the people around him, and generally behaving normally.");
        builder.presentAndWait();
        builder.addText("“This is very unlike him. Perhaps he is truly well?” Gertrude mutters to Claudius. “It would be very good to see his spirits lifted enough to free him from his madness... he does not even seek to antagonize Laertes as he has before.”");
        builder.presentAndWait();
        builder.addText("Claudius says nothing. Hamlet is looking at him. On his face is a smile, but behind the smile there is a message: ‘I know what you did.’");
        builder.presentAndWait();
        builder.addText("“Have something to say, uncle,” Hamlet asks, “where everyone can hear it?” Hamlet is perfectly cheerful. Claudius’s anxiety ramps up. Hamlet is fully in control and he knows it. In that moment, Claudius realizes that if he doesn’t do something, Hamlet will be this way for the rest of their lives- always lurking over his shoulder, waiting with the knowledge that will be Claudius’s doom.");
        builder.presentAndWait();
        builder.addText("Claudius shivers. There’s only one way out of this predicament...");
        builder.presentAndWait();

        builder.addOption("Claudius admits to his crimes", "S2O.39");
        builder.addOption("Claudius tries to kill Prince Hamlet himself", "S2O.40");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 21
        //----------------------------------------------------------------------
        builder.mark("S2O.21");

        builder.addText("Hamlet, sword in hand, stabs Laertes through the back of his chair, as the entire table sits and stares at the monstrosity that has been committed right in front of them. Claudius exclaims:");
        builder.presentAndWait();
        builder.addText("“Call the guards immediately, Hamlet’s madness has reached its peak! He shall live no more!”");
        builder.presentAndWait();
        builder.addText("As the guards rush into the room, Hamlet continues hacking at Laertes, making sure that his rival is dead. As soon as he fully realizes what he has done, he attempts to escape, rushing towards the opposite end of the room and trying to get out of the door on the other side, but there are more guards on that side as well. As the guards surround Hamlet and Gertrude cries to herself, Claudius smiles to himself, overjoyed that everybody who had any knowledge of his plot is now gone. He can rule Denmark in peace, with no fears that anybody will reveal his secret.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 22
        //----------------------------------------------------------------------
        builder.mark("S2O.22");

        builder.addText("Laertes dodges Hamlet, leaping out of his chair to avoid Hamlet’s murderous glee. Hamlet frowns and looks back at Laertes, who kicks his chair across the floor at him. The room is in chaos, with servants and nobles alike fleeing the room from Hamlet. He looks over and sees his mother, eyes wide with terror, rushing out of her chair towards the nearest exit. She raises her voice, and, stricken with panic, calls for the guard. In the pandemonium, Hamlet thinks he hears her call him violently insane.");
        builder.presentAndWait();
        builder.addText("However, Claudius is having trouble getting out of his chair. He is older and slower than the others, and with the chaos of Hamlet’s attempt there is no one to help him out. “Fitting that in the end, the murderer king should be abandoned. In their panic, they unknowingly leave him to his just fate!” Hamlet croons.");
        builder.presentAndWait();
        builder.addText("Claudius looks at Hamlet in terror. From the door, the clatter of guards’ boots can be heard rushing in. He has to act fast. Laertes is no longer a viable target, but now the original object of his revenge is. Hamlet twirls his sword and plunges towards Claudius, intent on the kill...");
        builder.presentAndWait();

        builder.addOption("Hamlet kills Claudius", "S2O.41");
        builder.addOption("Claudius dodges Hamlet too!", "S2O.42");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 23
        //----------------------------------------------------------------------
        builder.mark("S2O.23");

        builder.addText("Hamlet kills Laertes with the knife, plunging it deep into his chest. Claudius and Gertrude stand up in horror and begin to evacuate their seats. “Guards!” cries Claudius. “Guards! Prince Hamlet has killed Laertes! Do not let him escape! Show him no mercy!”");
        builder.presentAndWait();
        builder.addText("Hamlet starts to think that escape would be a very good idea. As much as he wants to kill Claudius, too, the whole castle is on high alert now. He would most certainly be killed for trying.");
        builder.presentAndWait();
        builder.addText("Hamlet drops the knife and runs through the halls of the castle. He grabs an old sword from a decorative suit of armor to defend himself. It is a decorative old thing, but with edge enough in it to help him against the guard in his escape.");
        builder.presentAndWait();
        builder.addText("A voice echoes down the corridor. “My lord!” Horatio comes running. “I heard Claudius’s cries... you really did it? You killed Laertes?”");
        builder.presentAndWait();
        builder.addText("“Indeed... and if you can help me escape, Horatio, we can survive to make good on my true revenge! Come now!”");
        builder.presentAndWait();
        builder.addText("The two book it through the twisting halls of the castle and manage to lose the guard for a bit. They stop to catch their breath, and Hamlet looks up. There is a window above them about ten feet up.");
        builder.presentAndWait();
        builder.addText("“Help me up, Horatio, and we shall escape through this window! The guard will never expect us to leave this way!”");
        builder.presentAndWait();
        builder.addText("“But lord,” asks Horatio, “we have no way of knowing how far from the ground this window is! I have a faster idea - let’s switch clothing so the guard follows me instead of you!”");
        builder.presentAndWait();
        builder.addText("Hamlet stops to consider these options. The clock is ticking...");
        builder.presentAndWait();

        builder.addOption("Hamlet and Horatio swap clothes", "S2O.43");
        builder.addOption("Horatio hoists Hamlet up through a window", "S2O.44");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 24
        //----------------------------------------------------------------------
        builder.mark("S2O.24");

        builder.addText("Hamlet gives his plate a sniff. It is a feast fit for a king: a juicy roast pheasant served with spices from the east and assorted fruits. But Hamlet looks over and sees Claudius watching him. He looks away as Hamlet notices him. Hamlet narrows his eyes. Suspicious...");
        builder.presentAndWait();
        builder.addText("“It’s so pleasant to be back,” Hamlet says to the quiet table. His mother nods but does not respond. Laertes glowers at him. Claudius smiles.");
        builder.presentAndWait();
        builder.addText("“Of course, dear boy. And really, you must tell us all about your intrepid adventure to England. We were so worried about you for so long...” Claudius feigns warmth, but Hamlet can see past the veneer of affected kindness.");
        builder.presentAndWait();
        builder.addText("Nonetheless, Hamlet begins spinning a tale to tell of how he was attacked by pirates and how he came to return to Denmark. As he does so, he picks up his knife and begins to cut into his slice of pheasant, but as he does so he glances over at Laertes’s plate to see how much he had eaten. He carefully carves away the right amount of meat to match what is on Laertes’s plate and, during an exciting moment in the story, while Laertes is distracted, switches plates with him. He finishes out his story and watches Laertes to see if his suspicion is correct.");
        builder.presentAndWait();
        builder.addText("It doesn’t take long for Hamlet to see that it is. Laertes begins to choke on his pheasant and reaches a hand out, gasping for air. Claudius and Gertrude stand from their places. “Laertes, are you okay? Say something!” says Gertrude. But Laertes has no words left. Before a doctor or servants can be summoned to help, Laertes is dead.");
        builder.presentAndWait();
        builder.addText("“So the pheasant was laced with poison...” Hamlet muses. “I should have known Claudius would take an underhanded tactic to try and be rid of me. He stands before Claudius or Gertrude can respond. “Poor Laertes! You’ll pay for this, Claudius!” He begins to move toward the king...");
        builder.presentAndWait();

        builder.addOption("Gertrude intervenes", "S2O.45");
        builder.addOption("Hamlet kills Claudius", "S2O.25");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 25
        //----------------------------------------------------------------------
        builder.mark("S2O.25");

        builder.addText("Hamlet tries to kill Claudius. He picks up the knife he used to carve the pheasant and advances towards Claudius, intent clear. Claudius backs toward the door, but before knows it, Hamlet sets upon him.");
        builder.presentAndWait();
        builder.addText("Hamlet tries to stab at Claudius, but feels a hand holding him back. It’s Gertrude, valiantly holding Hamlet away from his would-be victim. “Stop this, son! Please come to your senses- this is your uncle!”");
        builder.presentAndWait();
        builder.addText("Hamlet doesn’t look behind him as he roughly shakes Gertrude away and throws her to the floor. Her head hits the ground hard. She gives a little surprised cough and is still. Claudius looks down in horror at his unmoving wife on the floor as blood begins to leak from her head. It distracts him enough for Hamlet to bring the knife down into his chest, killing him.");
        builder.presentAndWait();
        builder.addText("Hamlet backs away and surveys the damage. Laertes has been poisoned, Gertrude has been bludgeoned, and Claudius has been concussed. He tries to feel sympathy for his victims, especially his mother, but finds he cannot. He isn’t relieved, either, just empty.");
        builder.presentAndWait();
        builder.addText("At that moment, Horatio, having heard the raucous chaos from the dining hall, pokes his head into the room. His jaw drops at the sight of all the dead, and of Hamlet unrepentantly spinning a knife around in his hands.");
        builder.presentAndWait();
        builder.addText("Horatio gulps. He knew what Hamlet’s intentions were, but seeing them in practice makes him sick to his stomach. For a moment, he thinks of running and getting help, but then he remembers his loyalty to his friend and his lord, prince Hamlet...");
        builder.presentAndWait();

        builder.addOption("Horatio remains loyal", "S2O.46");
        builder.addOption("Horatio has to do something...", "S2O.47");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 26
        //----------------------------------------------------------------------
        builder.mark("S2O.26");

        builder.addText("Claudius moves quickly, knocking the goblet out of Gertrude’s hand, where it spills onto the floor. As the liquid spills onto the ground, Gertrude is both confused and enraged at Claudius.");
        builder.presentAndWait();
        builder.addText("“Is this some sort of sick joke? All I wanted was a quick drink and a fair fight, but you and Laertes have robbed me of both!”");
        builder.presentAndWait();
        builder.addText("Claudius, turning back to her, says “You are certainly welcome to have a drink, there was just something ‘off’ with that cup in particular.”");
        builder.presentAndWait();
        builder.addText("Getrude, even more confused, asks him a question, one that deeply worries Claudius.");
        builder.presentAndWait();
        builder.addText("“You have seemed to be a big supporter of this fight, and even when Laertes is cheating, you seem to condone it. Something very strange is happening, and surely you can inform me as to what it is.”");
        builder.presentAndWait();
        builder.addText("Claudius, nervous, clears his throat and stutters.");
        builder.presentAndWait();
        builder.addText("“Well, it’s not exactly that I am on one person’s side. I am just nervous around Hamlet. His madness, well, it is not easy to deal with for me. That was why I tried to send him off to England, in the hopes that-”");
        builder.presentAndWait();
        builder.addText("Gertrude cuts him off immediately:");
        builder.addText("“Is this fight a way to get rid of Hamlet? Do you intend for Laertes to kill him during the fight?”");
        builder.presentAndWait();
        builder.addText("“No, certainly not, just that it might be preferable for him to be gone from this kingdom for a while.”");
        builder.presentAndWait();
        builder.addText("“What do you mean by that? He is royalty, and even in his madness, seems to have far better wisdom than you, to not knock the goblet from my hands. Again, why did you do that?”");
        builder.presentAndWait();
        builder.addText("Gertrude starts piecing together the admission from Claudius, and comes to the realization that Claudius must have had something placed into the goblet. Before the fight resumes, she calls Hamlet to her. As he arrives, she whispers in his ear.");
        builder.presentAndWait();
        builder.addText("“My son, I believe that Claudius means for ill to happen to you. Just recently, he claimed that it would be better if you were elsewhere, and I fear this fight may be an excuse for you to die. I believe that he may be trying to poison you with the refreshments, for he just now knocked a cup from my hand and cannot explain why. Quickly, fetch the guards and place Claudius and Laertes under arrest.”");
        builder.presentAndWait();
        builder.addText("Louder, she says: “He just knocked a goblet out of my hand, would you be so kind as to fetch me a drink?”");
        builder.presentAndWait();
        builder.addText("Hamlet slowly walks out of the court, goblet in hand, and finds the nearest castle guards. He gestures for the guards to follow him, and while they are walking back to the court, he informs them of what has occurred.");
        builder.presentAndWait();
        builder.addText("“Be courageous, for this will be dangerous, but we must arrest Claudius and Laertes before any more damage occurs. Claudius tried to poison Gertrude and I, and Laertes has been breaking the rules of the fight to try and kill me. On my signal, take the king under arrest. Now!”");
        builder.presentAndWait();
        builder.addText("They rush into the courtroom, swords drawn, and advance upon Claudius and Laertes. Hamlet addresses the audience as Claudius and Laertes are being surrounded.");
        builder.presentAndWait();
        builder.addText("“This imposter killed old King Hamlet, and recently tried to poison Queen Gertrude and I. I believe Laertes to be privy to his plans, as Laertes has been breaking the rules of the contest, while Claudius allows it to happen. By Claudius’ own admission, he has wanted me either banished from the kingdom or dead, and we as a kingdom can no longer trust a king so evil as Claudius.");
        builder.presentAndWait();
        builder.addText("As the guards begin to lead Claudius and Laertes away, a drumbeat march is heard at the door, and Fortinbras and ambassadors from England enter. Dumbfounded at why King Claudius is being led away by his own guards, Fortinbras demands an answer.");
        builder.presentAndWait();
        builder.addText("“What on earth is happening here? I came to meet the king, but now I find him being led away by the point of his own guards’ swords! Answer me immediately, and I will decide what your fate shall be.”");
        builder.presentAndWait();

        builder.addOption("Hamlet tells Fortinbras what has happened", "S2O.48");
        builder.addOption("Claudius pipes up first", "S2O.49");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 27
        //----------------------------------------------------------------------
        builder.mark("S2O.27");

        builder.addText("Gertrude refreshes herself.");
        builder.presentAndWait();
        builder.addText("Claudius’s eyes light up with horror as she brings the goblet to her lips and drinks deeply. She sighs and wipes her mouth. “Hamlet, you have only one more bout to declare yourself victor...” she begins to slur her words and her eyes unfocus. “...over this... Laertes, who... ah...” she slumps back in her chair and looks at Claudius in confusion. “What...?”");
        builder.presentAndWait();
        builder.addText("Claudius leaps out of his throne and shakes her. “Gertrude, Gertrude! Oh my God, she’s dead!” He hugs her close.");
        builder.presentAndWait();
        builder.addText("Hamlet and Laertes stare in astonishment at the scene before them, and they exchange a glance. Neither expected for this to happen, certainly. Hamlet marches forward, suppressing his anger. “Mother is dead... how? What was in that goblet?” He turns and glares at Claudius, who looks up from Gertrude’s body at Hamlet. His eyes dawn with the realization that both of his plots to poison Hamlet have failed.");
        builder.presentAndWait();
        builder.addText("The prince grabs him by the shoulders roughly and shakes the old king. “You know something! Tell me, what did you do to her!”");
        builder.presentAndWait();
        builder.addText("Hamlet does not relent in his angry demands, but up until this moment he had no reason to suspect poison. Claudius looks over at Laertes, whose face is a mask of conflict. If Laertes were to strike now, he could still get Hamlet out of the way... but only if Laertes’s conscience has not already caught up with him...");
        builder.presentAndWait();

        builder.addOption("Hamlet gets an answer", "S2O.50");
        builder.addOption("Laertes attacks!", "S2O.51");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 28
        //----------------------------------------------------------------------
        builder.mark("S2O.28");

        builder.addText("Hamlet lunges forward, rapier in hand, and tries to grab the sword of Laertes. Laertes, sensing that Hamlet has left himself open, stabs him in the arm. Hamlet curses, and takes a wild swing, which Laertes blocks.");
        builder.presentAndWait();
        builder.addText("The force of the swing knocks both swords out of their hands, and in the confusion, they accidentally pick up each other’s weapons.");
        builder.presentAndWait();
        builder.addText("Continuing to fight, Hamlet lands another hit on Laertes before the fight is broken up. As they get ready to start the next round, Queen Gertrude falls down, convulsing on the ground. Osric, startled, exclaims “look at the Queen!”");
        builder.presentAndWait();
        builder.addText("Hamlet, wondering what happened, asks Claudius. Claudius, nervous that Hamlet will discover the plot against him, tries to dodge the question.");
        builder.presentAndWait();
        builder.addText("“I’m sure that the violence displayed between you and Laertes was to blame. Are either of you wounded?”");
        builder.presentAndWait();
        builder.addText("Laertes, falling to the ground as well, realizes that in the scuffle, Hamlet wounded him with the poisoned rapier. Defeated, he says to Osric, who looks stunned:");
        builder.presentAndWait();
        builder.addText("“Of course this treachery would lead to my own demise. Osric, I dug my own grave with this deceitful plot.”");
        builder.presentAndWait();
        builder.addText("Hamlet, not believing Claudius’ answer for a second, walks over to the spectator area, and Gertrude, realizing that Claudius poisoned her, shouts “No, it was the drink! The drinks were poisoned!” with her last ounce of strength, before dying.");
        builder.presentAndWait();
        builder.addText("Laertes, hearing the commotion ensuing, decides to repent and disclose the information about the plot to Hamlet. As Hamlet shouts for the doors to be closed and Osric hurries to inform the guards, he turns to Hamlet.");
        builder.presentAndWait();
        builder.addText("“This was my fault, Hamlet. Nothing can save me or you now, in half an hour, you will be dead. My rapier was unsheathed and poisoned. When I stabbed you, your death was sealed, and the same for me. I will be dead soon, which was nobody’s fault but mine. Before I die, let me make everything clear to you. The King orchestrated this vile act, poisoning your mother, me, and you.”");
        builder.presentAndWait();
        builder.addText("Hamlet, shocked by this information, grabs the poisoned rapier and charges at the king.");
        builder.presentAndWait();
        builder.addText("“You poisoned the rapier as well? I’ll use this poison on you!”");
        builder.presentAndWait();
        builder.addText("He rushes the king, while the spectators shout and scream, horrified at what they are witnessing. He slashes at Claudius, and at bladepoint, he reaches for the poisoned goblet, and demands that Claudius drink.");
        builder.presentAndWait();
        builder.addText("“You treacherous swine, drink this poison that you killed my mother with!”");
        builder.presentAndWait();

        builder.addOption("Hamlet kills Claudius", "S2O.52");
        builder.addOption("Not enough poison", "S2O.53");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 29
        //----------------------------------------------------------------------
        builder.mark("S2O.29");

        builder.addText("Hamlet steps back, easily dodging Laertes’ thrusts. Feeling confident at Laertes’ sloppy swordsmanship, he decides to taunt him before finishing him off.");
        builder.presentAndWait();
        builder.addText("“Defense was never your father’s strong suit when it came to swords, but you apparently can’t either defend or attack well.”");
        builder.presentAndWait();
        builder.addText("Laertes, furious, realizes that Hamlet has left himself open and stabs him in the arm. Hamlet curses, and takes a wild swing, which Laertes blocks.");
        builder.presentAndWait();
        builder.addText("The force of the swing knocks both swords out of their hands, and in the confusion, they accidentally pick up each other’s weapons.");
        builder.presentAndWait();
        builder.addText("Continuing to fight, Hamlet lands another hit on Laertes before the fight is broken up. As they get ready to start the next round, Queen Gertrude falls down, convulsing on the ground. Osric, startled, exclaims “look at the Queen!”");
        builder.presentAndWait();
        builder.addText("Hamlet, wondering what happened, asks Claudius. Claudius, nervous that Hamlet will discover the plot against him, tries to dodge the question.");
        builder.presentAndWait();
        builder.addText("“I’m sure that the violence displayed between you and Laertes was to blame. Are either of you wounded?”");
        builder.presentAndWait();
        builder.addText("Laertes, falling to the ground as well, realizes that in the scuffle, Hamlet wounded him with the poisoned rapier. Defeated, he says to Osric, who looks stunned:");
        builder.presentAndWait();
        builder.addText("“Of course this treachery would lead to my own demise. Osric, I dug my own grave with this deceitful plot.”");
        builder.presentAndWait();
        builder.addText("Hamlet, not believing Claudius’ answer for a second, walks over to the spectator area, and Gertrude, realizing that Claudius poisoned her, shouts “No, it was the drink! The drinks were poisoned!” with her last ounce of strength, before dying.");
        builder.presentAndWait();
        builder.addText("With Hamlet’s insult against his dead father, realizing that his entire family would be killed by Hamlet, Laertes decides to take one final act of revenge. Hamlet might be able to kill the king, Laertes himself would certainly die. However, Hamlet not knowing that this next half hour would be his last would be the ultimate revenge. As Laertes feels his life slip away, he takes quiet solace in the fact that Hamlet won’t know he’s dying until he’s already gone.");
        builder.presentAndWait();
        builder.addText("Hamlet shouts for the doors to be closed and Osric hurries to inform the guards. Hamlet then starts questioning Claudius.");
        builder.presentAndWait();
        builder.addText("“Did you poison your wife? Were you behind all of this? Was that why you were trying to get me to drink, did you mean for that poison to be my demise?”");
        builder.presentAndWait();
        builder.addText("Claudius, trying to maintain his composure, denies all of this, thinking that Hamlet wouldn’t dare try anything with so many people in the room. Besides, with the poisoned rapier out of Hamlet’s hands, he should be completely safe.");
        builder.presentAndWait();
        builder.addText("As Hamlet isn’t able to prove anything, and with such a large crowd of people around him, who will no doubt protect the king, he decides to bide his time. Perhaps in the future, Claudius will be overcome by guilt and confess, or will slip up somehow; besides, having won the battle with Laertes, he should be celebrating and enjoying the fruits of his labor. As Claudius congratulates him, the crowd disperses. With only a few people in the room, Hamlet makes his way to the door, but feels overcome by a strange feeling. He collapses to the floor, and Horatio, shocked, begins to piece everything together. As Hamlet breathes his last, Horatio has a difficult decision to make.");
        builder.presentAndWait();

        builder.addOption("Horatio speaks up", "S2O.54");
        builder.addOption("Claudius explains himself", "S2O.55");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 30
        //----------------------------------------------------------------------
        builder.mark("S2O.30");

        builder.addText("“When I approved this ill-fated contest, I was not expecting the level of violence that we have seen today. Surely in the scuffle between Hamlet and Laertes, a mortal blow was struck. These two swordsmen should not have been allowed to fight each other, and had I known the intense feelings between them, I would not have allowed this to occur. Laertes clearly ended Hamlet’s life, and despite Hamlet’s attempt to cling to life, he must have quickly succumbed to his injuries. It is truly unfortunate that this has happened, and I will mourn his passing as long as I live. Laertes as well, lying over there, cannot be in good health either. This was a horrid mistake, and I shall never allow anything like this to happen again!”");
        builder.presentAndWait();
        builder.addText("As Gertrude cries over her fallen son and Claudius looks with feigned sadness at the death that he has brought, Laertes motions to Horatio to come closer.");
        builder.presentAndWait();
        builder.addText("“Claudius poisoned the sword and the chalice; he killed both Hamlet and I, and you must avenge our deaths. That evil snake must not be allowed to get away with this horrific crime!”");
        builder.presentAndWait();
        builder.addText("Horatio, stunned at this, looks at Claudius and then back at Laertes, who is slowly perishing on the floor. Claudius glances back, while consoling Gertrude about Hamlet. “Perhaps he knows...” thinks Horatio to himself. With Hamlet dead on the ground, and the King pretending to cry himself, surely nobody would believe him if he were to speak up now. As he walks out of the courtroom, saddened by the passing of his friends, Claudius turns to his guards and whispers:");
        builder.presentAndWait();
        builder.addText("“Have Horatio thrown in the dungeon.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 31
        //----------------------------------------------------------------------
        builder.mark("S2O.31");

        builder.addText("Gertrude, realizing that this could be her only chance, begins to address Fortinbras directly, knowing that if he does not speak now, he will surely be killed by Claudius.");
        builder.presentAndWait();
        builder.addText("“King of Norway, this scoundrel in front of you was the one that caused this. He murdered old King Hamlet, and to cover up his evil deeds, killed everybody in this room. His friend’s son, Laertes, was killed with what appeared to be symptoms of poisoning, of which his nephew, Hamlet, died as well.”");
        builder.presentAndWait();
        builder.addText("Fortinbras furrows his brow, and Claudius quickly speaks up.");
        builder.presentAndWait();
        builder.addText("“Fortinbras, my wife clearly seems to blame me for what happened in the room here. These young men were engaged in a duel, and, enraged as they were, they began slashing and hacking at each other. They both struck each other with a mortal blow, and both lie dead before us. My wife, wife of the dead King Hamlet, has always been grasping for power, and seeing a chance, she sought to defame my reputation in the hopes that I would be executed by the armies of Norway, while she ascended to the throne in my stead.”");
        builder.presentAndWait();
        builder.addText("Gertrude, realizing that Fortinbras would surely believe Claudius over her, looks Claudius directly in the eyes. Claudius has a slight smirk on his face, and Fortinbras, behind him, does not look convinced at all. Fortinbras turns back and says:");
        builder.presentAndWait();
        builder.addText("“Well, if there is no proof, I have no other choice than to take you into captivity for attempted treason against your husband and king. Guards, seize her!”");
        builder.presentAndWait();
        builder.addText("As the guards drag Gertrude away to spend the rest of her life in prison, Claudius addresses Fortinbras with an attempted peace offering.");
        builder.presentAndWait();
        builder.addText("“Now that we’ve put those unfounded claims behind us, we should talk about this war. I know that you are a reasonable man, and are we really so different that we cannot resolve this dirty business between us? Our armies would be far better together, would they not? Your kingdom only had issue with old King Hamlet, and now that all his family is gone and I am king over the land, can we not resolve to stop this war between us and rule in peace?”");
        builder.presentAndWait();
        builder.addText("Fortinbras, in disbelief as to what he is witnessing, disagrees vehemently.");
        builder.presentAndWait();
        builder.addText("“My army surrounds your castle, and you dare to offer an alliance? Besides, even though your wife had no proof, the notion that you could be responsible for the deaths of so many is something that I can certainly believe. I could have you killed right now and put a puppet in your place, and nobody would bat an eye! However, you do know the wishes of the public, you can speak their language, and you are part of the royal family. As I cannot rule over two distant kingdoms at once, I will let you rule over Denmark as a puppet to my government. If you disagree, the war against what little is left of your kingdom will continue.”");
        builder.presentAndWait();
        builder.addText("Claudius, realizing that he has no other choice, accepts Fortinbras’ terms. His plot to be king will never be fully realized, but at least he will be able to continue to govern over Denmark. In the end, Gertrude, Hamlet, and Horatio were still able to foil Claudius’ plans, even if indirectly.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 32
        //----------------------------------------------------------------------
        builder.mark("S2O.32");

        builder.addText("“Fortinbras, prince of Norway, you come to us in troubled times. The bodies you see here are those of my son prince Hamlet and noble Laertes. They died at each others’ hands, but they were turned against each other by this deceitful creature that calls itself king!” She turns and points to Claudius, who shrinks back into his throne. “This is Claudius, on whose hands the blood of two young men lies!”");
        builder.presentAndWait();
        builder.addText("Fortinbras’s face is a mask of surprise. He looks between Gertrude, who stands before him with unmatched confidence, and Claudius, who offers no rebuttal but to look on with terror and guilt in his eyes. “Is this all true?” asks Fortinbras. “These are serious accusations to levy against a king.”");
        builder.presentAndWait();
        builder.addText("From the sidelines, Horatio steps forward. He is clearly trying to hold himself together in the presence of the foreign prince, but his eyes dart to the dead bodies of the two young men and they begin to well with tears. “They are only the beginning of Claudius’s crimes, prince Fortinbras. What the queen says is true - I have witnessed all that has transpired and can vouch for her as a humble servant removed from the court. What is more, I have it on good faith that Claudius murdered his brother, the old king, to take his crown.”");
        builder.presentAndWait();
        builder.addText("Fortinbras’s eyes widen. Gertrude grits her teeth. “His untimely death was Claudius’s fault!? I have never been so deceived in all my life! Guards!” she calls. “Throw Claudius to the dungeon! Never again shall I allow that conniver or any other to win so much power over all of Denmark!”");
        builder.presentAndWait();
        builder.addText("Fortinbras steps forwards as guards come to seize Claudius, who struggles weakly against them. “Queen Gertrude, your virtue shines through even in the darkest of times. Now that Denmark is without a king, I shall be sure to step in and reign Denmark in turn-”");
        builder.presentAndWait();
        builder.addText("Gertrude holds a hand up to stop him. “Your gesture is valiant, prince, but that will not be necessary. I will take over as regent- as queen to two kings of Denmark, I have more than enough claim to rule this land, and now I know to watch for schemers, as well. Your gesture is appreciated, but Denmark shall remain independent - but with much to thank Norway for.”");
        builder.presentAndWait();
        builder.addText("Fortinbras bows. “Yes, Queen Gertrude. So be it.”");
        builder.presentAndWait();
        builder.addText("Thus did the glorious reign of Queen Gertrude begin.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 33
        //----------------------------------------------------------------------
        builder.mark("S2O.33");

        builder.addText("“Do not fear, mother,” he says, drawing her attention. “It is no less than my uncle Claudius deserves.”");
        builder.presentAndWait();
        builder.addText("Gertrude turns and stares at him with narrowed eyes. “Why do you speak so coldly of my husband and our king?”");
        builder.presentAndWait();
        builder.addText("Hamlet coughs. For some reason he is feeling rather faint. “Claudius has, by making me his enemy, become his own undoing. In the moment that he gave me the goblet to refresh myself, I suspected an opportunity and switched cups with him while he was distracted. He drank poison, and so took his own life!” He smiles weakly.");
        builder.presentAndWait();
        builder.addText("Gertrude’s eyes widen. “Drank poison?! There was poison in the goblet?”");
        builder.presentAndWait();
        builder.addText("Laertes’s eyes light up with tired energy. He seems to feel the same loss of energy that Hamlet is as he bleeds from the chest. “Prince Hamlet, you poisoned the king! This whole event was a scheme to kill him!” Laertes’s eyes flutter, and he drops to one knee. “And I, too, am poisoned...”");
        builder.presentAndWait();
        builder.addText("Gertrude covers her mouth as Laertes falls to the floor, dead. She snaps to Hamlet. “My son, how could you! Your madness knows no bounds.”");
        builder.presentAndWait();
        builder.addText("Hamlet looks at her in a dazed confusion. “But I... the poison was already there...” he lifts a shaky hand to his head. “Oh, no.”");
        builder.presentAndWait();
        builder.addText("Hamlet falls to the ground and breathes his last. Horatio rushes over and checks him, only to find that he is beyond saving. “My lord, my friend! He is dead!” He stares up at the queen pleadingly. “There has been a mistake! Claudius is a plotter - the true murderer!”");
        builder.presentAndWait();
        builder.addText("Gertrude regards him stiffly and turns away. “Hold your tongue. Laertes has revealed all... a true hero. And a hero’s funeral shall he receive.” She shakes her head. “That my own son could be so cruel as to kill his uncle... how awful! Never again shall we speak of young Hamlet. He has damned his own memory.”");
        builder.presentAndWait();
        builder.addText("Horatio looks on in horror as Hamlet’s body is taken from him to be thrown out of the castle into the gutter. Laertes is lifted gently to be given a true funeral as his sister never received. “There is no justice...” he whispers to himself..");
        builder.presentAndWait();
        builder.addText("Gertrude looks down at him. “But at last... there will be peace.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 34
        //----------------------------------------------------------------------
        builder.mark("S2O.34");

        builder.addText("Before Hamlet can reveal what he has done, Laertes pipes up.");
        builder.presentAndWait();
        builder.addText("“The king is dead because of Hamlet!” he cries. “He has killed king Claudius with the poison in that chalice! And look!” He points to the bloody gash on his chest. “This wound, too, is poisoned! It is all part of a plot to kill the king and myself! As he would, for Hamlet has killed Ophelia and my father, too!”");
        builder.presentAndWait();
        builder.addText("Hamlet and Gertrude stare at Laertes, who pants with exhaustion. The battle and the poison have taken their toll, and the act of declaring the poison plot has taken much of his rapidly-waning strength from him.");
        builder.presentAndWait();
        builder.addText("Gertrude turns to Hamlet. “My son, is this true? Did you conspire to kill my husband and Laertes?”");
        builder.presentAndWait();
        builder.addText("Hamlet coughs awkwardly. His strength is quickly fading, too. “It is true that there was poison in Claudius’s goblet and on the blade that maimed Laertes. But Claudius drank from his own chalice. And everyone here who witnessed the duel can attest that I wounded Laertes with his own blade.” He touches his dripping wound and drops to one knee with fatigue. “The very same blade he slashed me out of turn with...”");
        builder.presentAndWait();
        builder.addText("Hamlet collapses to the ground and is still. Horatio rushes over and checks him, only to find that he is beyond saving. “My lord, my friend! He is dead!” He stares up at the queen pleadingly. “Do you now see the truth of Claudius’s treachery?”");
        builder.presentAndWait();
        builder.addText("Gertrude is silent for a moment. At last, she says, “Laertes, it is true. We all saw you stab my son out of turn, and how he wrested away your sword to wound you. You have only betrayed your bitter intentions in your attempt to demonize my son.”");
        builder.presentAndWait();
        builder.addText("Laertes’s eyes flutter. “But... Hamlet killed my sister.” He shakes his head dizzily. “Oh, no.” He falls to the ground and breathes his last.");
        builder.presentAndWait();
        builder.addText("Gertrude watches Laertes die with a mixture of spite and pity. After a moment, she turns to regard her son. Horatio is hugging his body and holding back tears.");
        builder.presentAndWait();
        builder.addText("“So Hamlet was fending off Claudius’s scheming the whole time... I am ashamed to have taken him for a husband. I have misjudged my son. But no more. My son has revealed himself to be a true hero. And a hero’s funeral shall he receive.”");
        builder.presentAndWait();
        builder.addText("Horatio steps back, wiping away tears, as servants gingerly lift Hamlet’s body and carry it away to his bedroom. Laertes’s body is taken as well, but taken out of the castle to be forgotten for his crimes.");
        builder.presentAndWait();
        builder.addText("“Rest easy, my friend,” Horatio sniffs. “Because of you, your father is avenged.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 35
        //----------------------------------------------------------------------
        builder.mark("S2O.35");

        builder.addText("As the guards enter the room, spears drawn, Hamlet realizes that there is nothing that he can do anymore. With Claudius drawing his own sword, there is no way to kill him. Sadly, Hamlet raises his hands in defeat, and lets the guards lead him away. At least the King didn’t mention the death penalty, and as a prince, he will be allowed to have better quarters than the normal prisoners. As he is thrown in jail, he is relieved that at least he isn’t dead. There’s no way for him to regain his reputation, so there’s no reason that Claudius should kill him.");
        builder.presentAndWait();
        builder.addText("As night falls and Hamlet starts drifting off, suddenly, old King Hamlet’s ghost starts materializing in the cell with him. Hamlet, terrified, is immediately woken up to his father’s ghost scolding him.");
        builder.presentAndWait();
        builder.addText("“You have failed me. You failed to avenge my death, and now Claudius will reign over the kingdom. Is there no justice in this kingdom? I suppose there will be soon...”");
        builder.presentAndWait();
        builder.addText("Hamlet feels a force on his shoulders, as if the ghost was dragging him down, and to his horror, he sees the floor rising up. As he tries to pull himself away, he sees his body on the floor, as his spirit is dragged down through the earth to the depths of hell.");
        builder.presentAndWait();
        builder.addText("King Hamlet did indeed get his revenge that night, and in the morning, as the jailers opened the cell to find Hamlet’s corpse on the floor, they had no idea what had happened the night before.");
        builder.presentAndWait();

        builder.jumpTo("END");
        
        //----------------------------------------------------------------------
        // 36
        //----------------------------------------------------------------------
        builder.mark("S2O.36");

        builder.addText("The old king rises from his seat and turns to run, but it is too late. Hamlet falls upon him, sinking the knife into his back over and over again until there is more blood than man. Claudius falls to the ground lifelessly, bleeding out. Hamlet smiles and wipes the knife off on his jacket. Even if he didn’t get Laertes, he got the big one-");
        builder.presentAndWait();
        builder.addText("Hamlet’s thoughts are interrupted as he suddenly finds himself surrounded by the castle guard, armed with swords and spears. He spins around, searching for an escape and waving his knife, but the guards thoroughly wall him in. In desperation, he lunges at one thin guard, trying to force his way out through the man.");
        builder.presentAndWait();
        builder.addText("This is all the guard needs to fall upon Hamlet and attack him from all directions. Hamlet is cut open from every angle and the blood comes pouring out even faster than Claudius did from his attack. He is forced to the ground by the attack and begins to grow faint.");
        builder.presentAndWait();
        builder.addText("Looking up at the angry faces of the guards as they stab and slash him to death, Hamlet sees another face join them. It is the face of his father, robed in white, untouched by the carnage. He wears his old crown and smiles at him.");
        builder.presentAndWait();
        builder.addText("“You have done well, my son, to avenge me,” old king Hamlet says. His voice rings over the grunts of the guards, who, along with everything else in the world, begin to fade away to white. “Because of you, I can leave this earthly purgatory and move on to heaven. Never was there a more loyal son.”");
        builder.presentAndWait();
        builder.addText("Hamlet nods and returns the smile weakly. “I went through hell for you, father, but the deed is done... I do not have long now. Will you take me to heaven with you?”");
        builder.presentAndWait();
        builder.addText("The ghost smiles again. This smile is more ambiguous and less friendly. “Your final destination is not for me to take you to... you will have to see where you end up on your own.”");
        builder.presentAndWait();
        builder.addText("With that, the ghost departs and young Hamlet breathes no more.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 37
        //----------------------------------------------------------------------
        builder.mark("S2O.37");

        builder.addText("Hamlet stands and faces Laertes. “I won’t let you take my life, but I won’t spill your blood today either.”");
        builder.presentAndWait();
        builder.addText("“You won’t have a choice.” Says Laertes, as he lunges towards Hamlet with the knife. Hamlet leaps to the left out of the way of the blade, and Laertes stumbles by. “Don’t do this Laertes - see reason!” Laertes, eyes red with hate, yells and lunges again, only for Hamlet to dart left out of the way.");
        builder.presentAndWait();
        builder.addText("Seeing that he was whipping Laertes into an even greater rage, Hamlet waited for his chance to disarm him. After lunging again, Laertes left Hamlet a window. He took it. Hamlet grabbed Laertes and tackled him to the ground, knocking his knife away. The two scuffled on the ground, as the castle guard ran in and pulled them apart.");
        builder.presentAndWait();
        builder.addText("Gertrude, seeing Hamlet’s clear-headedness in the exchange, praises her son. “I was worried we would never see the real you again, but you’ve conquered your madness.” She says. Claudius stands off to the side, saying nothing and looking embarrassed for Laertes, who not only missed his chance but was made a fool by Hamlet.");
        builder.presentAndWait();

        builder.addOption("Hamlet avenges his father while he has the chance", "S2O.56");
        builder.addOption("Hamlet puts his father’s death behind him", "S2O.57");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 38
        //----------------------------------------------------------------------
        builder.mark("S2O.38");

        builder.addText("Hamlet invites Laertes to come towards him, goading him as he approaches. “You could never understand the love that Ophelia and I had.” He says. Laertes' face darkens as he moves across the table towards Hamlet.");
        builder.presentAndWait();
        builder.addText("Laertes grabs a knife from the table and holds it as though the stab Hamlet. Hamlet looks amused. “You don’t have the courage, nor the ability to take me-” Before Hamlet can finish, Laertes lunges across the table towards him. Gertrude gasps and tries to stop him, but Claudius holds her back with his arm. Laertes knife finds Hamlet in the chest, right between the ribs. He collapses next to the table.");
        builder.presentAndWait();
        builder.addText("“The boy really was mad!” Claudius says, sensing he needs to act quickly to salvage the situation. “To mock Laertes in this time of grief, and not even defend himself!” He turns to Gertrude, “He truly must have been lost long before he arrived back home.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 39
        //----------------------------------------------------------------------
        builder.mark("S2O.39");

        builder.addText("He looks around the table and stands. All eyes are on him as he says. “I feel a little faint, and shall retire to bed early. Some light!” He claps. Servants with candles come over to guide him to his room. “Away!”");
        builder.presentAndWait();
        builder.addText("He stumbles off to his room while the others look at each other, confused. Claudius has never acted like this before... only Hamlet, smiling with unshakeable good cheer, brings the mood back to the table by relating a story from his voyage to England. He watches Claudius leave with a twinkle in his eye. He got to him.");
        builder.presentAndWait();
        builder.addText("The next day, Claudius is nowhere to be found around the castle. In his room, Gertrude finds a note that shocks everyone in the kingdom: a confession that Claudius killed his brother, old king Hamlet, in order to take the throne. A postscript attached to the note names young prince Hamlet as Claudius’s rightful chosen successor.");
        builder.presentAndWait();
        builder.addText("Hamlet takes the throne in a coronation ceremony the next week. Claudius is not in attendance, for he has not been seen by anyone in Denmark since leaving the guilty note. His disappearance becomes one of the great mysteries of Danish history, on par with the English mystery of the nephews in the tower.");
        builder.presentAndWait();
        builder.addText("One person who is in attendance, though, is Laertes. He glowers as the crown is lowered onto Hamlet’s head. Resentment builds at the sight of Hamlet’s beaming face, and the applause he receives from the court. He turns his head and sneers.");
        builder.presentAndWait();
        builder.addText("“So, prince Hamlet wins the throne he always wanted... and along the way, brought about the deaths of my innocent father Polonius and sister Ophelia. Well, your majesty, just wait. Just as your uncle won the throne from your father, and just as you won the throne from your uncle, so shall I win the throne from you. However long it takes, I shall lie in wait. You reap what you sow!”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 40
        //----------------------------------------------------------------------
        builder.mark("S2O.40");

        builder.addText("As the meal continues, the idea that he must kill the prince grows more and more unshakeable, as he watches Hamlet’s confident, easy demeanor. “I must take things into my own hands,” Claudius whispers to himself. “No one else can be trusted- not while the prince has their confidence!”");
        builder.presentAndWait();
        builder.addText("The next day, Claudius orders Osric, the servant, to bring a sword to the throne room and stow it behind the throne. He then sends Osric with a message to Hamlet declaring that Claudius is to meet Hamlet alone in the throne room. Osric bows and dutifully carries out his instructions, not putting together what it means for the prince.");
        builder.presentAndWait();
        builder.addText("At the designated time, Hamlet arrives to the throne room. He is wary, and stands back from the king where he sits. However, he does not show it in his voice. “Your majesty, what do you need from me today? I have felt as light as a feather lately, and so full of energy that I am happy to fulfill whatever you should need.”");
        builder.presentAndWait();
        builder.addText("Without saying a word, Claudius beckons Hamlet closer. Hamlet moves the bare minimum toward him, but Claudius becomes frustrated. “Come here, boy! Come meet your fate!”");
        builder.presentAndWait();
        builder.addText("Hamlet blinks. “My fate?”");
        builder.presentAndWait();
        builder.addText("The king loses his patience and whips his sword out. “Your fate is to join your father! Death to those who oppose me!” He rushes at Hamlet, who dives out of the way.");
        builder.presentAndWait();
        builder.addText("Hamlet cries out. “Help, ho! The king has gone mad!”");
        builder.presentAndWait();
        builder.addText("At that moment, Laertes rushes into the room. “What?”");
        builder.presentAndWait();
        builder.addText("He sees Hamlet being attacked by the king. Instinct takes over- while Laertes has no love for Hamlet, his gut tells him to attack the attacker. Before he knows it, Laertes falls upon Claudius. The older man turns in surprise- just in time to get a sword through his stomach.");
        builder.presentAndWait();
        builder.addText("Hamlet and Laertes watch as Claudius dies on the floor and look at each other. “Laertes, you have my eternal gratitude. Claudius has wanted me dead for a long time, and he killed my father too.”");
        builder.presentAndWait();
        builder.addText("Laertes looks around. “Your father, as well? I thought his death was suspicious... but I have made a grave mistake. I have killed the king.”");
        builder.presentAndWait();
        builder.addText("Hamlet taps his chin. “And yet, in doing so, I shall become the king. While an explicit pardon of you would make me look complicit, I can very well spare you... I know of a place where you can find peace, a few counties far out that you can make your own and escape the consequences.”");
        builder.presentAndWait();
        builder.addText("Laertes looks away. “I do not know if I deserve this.”");
        builder.presentAndWait();
        builder.addText("“You are a good man, Laertes, a better man than perhaps you know, and a better man than myself at times. We are not so different- I would have done the same in your place. Let me grant you this boon.” Hamlet looks behind him. “Now off with you! I shall be king, and you shall live to see another day.”");
        builder.presentAndWait();
        builder.addText("The two men embrace and part ways. It is not a clean or just ending for either, but it is a happy one.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 41
        //----------------------------------------------------------------------
        builder.mark("S2O.41");

        builder.addText("Hamlet, enraged, overpowers Claudius with his sword and manages to slash him multiple times. To make sure that he is taken care of for good, he forces him to drink the poison as well. Claudius, with his last ounce of strength, calls for the castle guard to assist him. As they rush to the scene, they are shocked at what has happened; Hamlet cutting Claudius to pieces is the last thing they were prepared for.");
        builder.presentAndWait();
        builder.addText("The guard seizes upon Hamlet, encircling him as he assaults Claudius. The last thing he sees is their angry faces as they get their retribution for the killing of the king.");
        builder.presentAndWait();
        builder.addText("When the dust settles, Hamlet and Claudius are dead. Gertrude stands off to the side, covering her face from the awful sight of the two people closest to each other wrapped in a bloody mess on the ground. Laertes looks down and grimaces.");
        builder.presentAndWait();
        builder.addText("“What a terrible spectacle,” Laertes says at last. “And because of these two and their awful spat, Denmark is in a state of anarchy.” He looks to the guards. They seem to agree. “Lower the coat of arms of Claudius. His dynasty has ended today... now I shall take the throne for my own.”");
        builder.presentAndWait();
        builder.addText("Gertrude looks up, appalled. “You cannot just seize the throne while I still live!”");
        builder.presentAndWait();
        builder.addText("Laertes looks over at her. “I do not intend to seize the throne. You are going to give it to me. You have seen the damage the two Hamlets and Claudius have dealt to Denmark- I will be the one to fix the damage, in honor of my fallen sister and father.” Gertrude does not respond. “You will remain on the throne,” Laertes declares, “as my queen.”");
        builder.presentAndWait();
        builder.addText("“It is abhorrent,” Gertrude says at last.");
        builder.presentAndWait();
        builder.addText("“No worse than what the kings before me have done,” Laertes responds. “And with Hamlet and Claudius dead, I carry no grudges with me to the crown. Denmark shall flourish once more- without the burden of the past.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 42
        //----------------------------------------------------------------------
        builder.mark("S2O.42");

        builder.addText("Hamlet fumbles past as Claudius knocks over his chair in a desperate attempt to get out of Hamlet’s way, and in doing so trips Hamlet. The young prince loses his balance and, for a few tense moments, finds himself in midair. Reality crashes back into him as he hits the ground hard. He clutches his arm and realizes his hand is empty. In the fall, it seems he let go of his knife. But where could it be...");
        builder.presentAndWait();
        builder.addText("Hamlet hears a pained croak and looks across the room. His mother is leaning against the door, holding herself up. Embedded in her lower back is the knife. She turns herself around slowly and looks Hamlet in the eye, and then looks down at the blood seeping from the wound. She sighs and collapses to the floor.");
        builder.presentAndWait();
        builder.addText("Hamlet quickly picks himself up off the ground and races over to his mother. She has lost consciousness, and by her weak breaths he judges that she doesn’t have much time. “Help!” he cries. “My poor mother... the queen! She’s dying!” He hugs her body close to him and weeps.");
        builder.presentAndWait();
        builder.addText("The knife is still embedded in her back. Hamlet carefully pulls it out and looks it over. “My mother has paid the price for my crimes... my inability to let go of the past, my inability to forgive a slight against me, has killed her! It’s my fault.");
        builder.presentAndWait();
        builder.addText("He turns and looks at Claudius and Laertes, who are still in the room, watching him with a mixture of apprehensiveness and pity. “Do you know,” he tells them, “that it was my father’s ghost who told me to kill Claudius? Do you know that following a dead man’s insubstantial wishes has caused all of this? And why did I not stop?” He raises the knife and points it inward. “Well, enough is enough. I have killed Polonius, I have killed Ophelia, and I have killed my mother. Now, finally, I will kill someone who is not innocent!”");
        builder.presentAndWait();
        builder.addText("With that, he plunges the knife into his gut. He does so again, and one more time before the life is fully gone from his body.");
        builder.presentAndWait();
        builder.addText("Laertes and Claudius stare in shock. Laertes is in sad, silent contemplation of his relation to Hamlet. Claudius has no such emotions about his nephew’s despairing suicide.");
        builder.presentAndWait();
        builder.addText("He summons a number of servants. “Throw Hamlet’s body out,” he tells them. “He’s done enough to bring misery to this castle; I will not prolong our suffering by mourning over his murderous insanity.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 43
        //----------------------------------------------------------------------
        builder.mark("S2O.43");

        builder.addText("Pressed for time, Hamlet takes Horatio’s vest and boots, and Horatio takes Hamlet’s jacket and sword. In the dark corridors, it is hard to tell their features apart. Hamlet claps Horatio on the back. “And we have plenty of time to spare... let us away, Horatio! I will head for the servants’ quarters, and you head for the door!”");
        builder.presentAndWait();
        builder.addText("Horatio nods solemnly. He seems much more aware of the danger of the situation than Hamlet is. He takes off, still buttoning his jacket. Hamlet looks behind him as he runs away. He utters a muffled prayer for Horatio and sprints off to the servants’ quarters.");
        builder.presentAndWait();
        builder.addText("Hamlet sneaks around, doing his best not to arouse attention. The whole castle is aroar, with guards running around looking for Hamlet, calling each other one direction or another while minor nobles and castle servants run and hide in terror. In the chaos, Hamlet is able to avoid notice by keeping his head down and moving in crowds of servants.");
        builder.presentAndWait();
        builder.addText("After a while, news comes around. One of the guards caught and killed prince Hamlet in an attempt to escape through the castle gates. Hamlet lowers his head. Horatio’s horrible end was because of his actions...");
        builder.presentAndWait();
        builder.addText("Hamlet knows that it will take a while for the king to come down and see that “Hamlet’s” body is not the real prince, so in the brief lull after Horatio is killed, he steals across the gate. He is not the only one, as numerous common servants leave or are kicked out of the castle in the aftermath of the chaos Hamlet caused.");
        builder.presentAndWait();
        builder.addText("Hamlet does not dare to look back until he is several miles away from the castle, on the outskirts of town. Eventually, he stops to catch his breath, and it all comes back to him. He curses and kicks at the ground.");
        builder.presentAndWait();
        builder.addText("“My good friend Horatio died to protect me... me, Hamlet the dane, who did nothing but follow petty grievances and bring sorrow to those around him! He deserved better than me, and I will never come close to deserving him.” Bitter tears fall to the ground around him. “I will never forget you, Horatio... and I will not let your sacrifice go easily! Claudius will pay! All of Denmark will pay!”");
        builder.presentAndWait();
        builder.addText("Prince Hamlet was never seen again after the day he killed Laertes, and Claudius reigned many more years before his death. But many years later an infamous pirate captain arose and amassed a loyal legion of corsairs to plague the seas around Denmark. While none dare connect the two criminals in public, many a rumor claims that this pirate captains are none other than the vagrant prince, seeking revenge for his loyal friend... but who can say?");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 44
        //----------------------------------------------------------------------
        builder.mark("S2O.44");

        builder.addText("“Quickly, Horatio! Help me through the window!” Hamlet cries. “This shall be the avenue of our escape!”");
        builder.presentAndWait();
        builder.addText("Horatio glances behind him, hearing the cacophony of footsteps. “But my lord, the guard shall be upon us any moment!”");
        builder.presentAndWait();
        builder.addText("“Which is why we must be quick! Lift me up, good Horatio!” Hamlet doesn’t wait for Horatio’s response before he starts to scrabble up the side of the wall towards the large open window. Horatio sighs and rushes over for Hamlet to push off of his to reach the window.");
        builder.presentAndWait();
        builder.addText("Hamlet limberly swings himself over the side of the sill and reaches a hand down. “Come, Horatio, take my hand and we shall be off!”");
        builder.presentAndWait();
        builder.addText("Horatio jumps up and grabs on to Hamlet. After a moment’s effort, he kicks his way up the wall and Hamlet hoists him through the window. Not a moment too soon- the second Horatio is up, the guard rushes through. Hamlet shuts the window before they are spotted, and the two hold as still as statues while the mass of guards rush through.");
        builder.presentAndWait();
        builder.addText("“We must be careful, Horatio. They will expect us to escape the castle, but if we do so we will never have another chance to enact revenge upon my father’s killer. Are you steady?”");
        builder.presentAndWait();
        builder.addText("Horatio looks down. The window is a good thirty feet above a rampart. “As steady as I can be, lord.”");
        builder.presentAndWait();
        builder.addText("“And a steadfast fellow you are, Horatio. Let us creep upwards - I know where Claudius’s room is. We can hide there.”");
        builder.presentAndWait();
        builder.addText("The two slowly ascend the castle, looking down periodically to avoid the gaze of the guards. Eventually, after a long, perilous climb, the two find Claudius’s room and look around. “Claudius is not here,” declares Hamlet. “All the better, that we may surprise him by hiding in his refuge!”");
        builder.presentAndWait();
        builder.addText("“Here, lord, behind this arras,” says Horatio, pointing to a large tapestry stretched across the room. The two creep behind it and lie in wait.");
        builder.presentAndWait();
        builder.addText("“Do you see this, Horatio?” says Hamlet. “There is a portrait of my father hidden back here! As the king’s chamber, this must once have been his room... even here does Claudius erase my noble father’s memory!”");
        builder.presentAndWait();
        builder.addText("“His villainy knows no bounds,” Horatio replies. “But soft! Here he comes!”");
        builder.presentAndWait();
        builder.addText("The two keep silent as Claudius enters the room. He is clearly anxious about Laertes’s death and mutters prayers to himself as he sits down on his bed.");
        builder.presentAndWait();
        builder.addText("“He prays, but this is no church; now my mind is set. Nothing can save him!” whispers Hamlet.");
        builder.presentAndWait();
        builder.addText("Claudius whips his head around. “Who is that? What demon now speaks to me in my own quarters?”");
        builder.presentAndWait();
        builder.addText("“No demon but yourself, Claudius,” Hamlet declares, “and no angel but myself, Hamlet the dane! Now shall my dead father have justice!” He throws the arras aside, and he and Horatio set upon the terrified king.");
        builder.presentAndWait();
        builder.addText("The work is done quickly, and just as quickly are Hamlet and Horatio gone. That night, Claudius is found, with a message written from Hamlet detailing his crimes.");
        builder.presentAndWait();
        builder.addText("As for Hamlet, he and Horatio are never found. However, many years later an infamous duo of pirates arose and amassed a loyal legion of corsairs to plague the seas around Denmark. While none dare connect the two sets of criminals in public, many a rumor claims that this duo of pirate captains are none other than the vagrant prince that killed the king in revenge and his loyal friend... but who can say?");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 45
        //----------------------------------------------------------------------
        builder.mark("S2O.45");

        builder.addText("Before Hamlet can harm Claudius, Gertrude intervenes:");
        builder.addText("She steps between her son and her husband and says, “My son, please think for a moment. These are wild claims you purport to make - that our king poisoned Laertes, and that you should now take matters into your own hands and kill him in kind? Listen to yourself, Hamlet.” She puts a hand on his shoulder. “You seem to be somewhat recovered from your madness, but you still need help.”");
        builder.presentAndWait();
        builder.addText("Claudius raises a hand. “I believe that I did not recognize it in the moment because of the engrossing tale Hamlet told us, but I also must say that Hamlet switched plates with Laertes while poor Laertes was not looking.”");
        builder.presentAndWait();
        builder.addText("Gertrude looks at Hamlet accusingly. Hamlet takes a step back and says, “I certainly did nothing to the food.”");
        builder.presentAndWait();
        builder.addText("“If you did nothing to the food,” Gertrude replies, “then you will certainly have no problem eating what is on Laertes’s plate - or should I say your plate.” She picks the platter of pheasant up and shoves it under Hamlet’s nose. “Eat.”");
        builder.presentAndWait();
        builder.addText("“That’s not what I meant!” protests Hamlet. “I did nothing to the food, but-”");
        builder.presentAndWait();
        builder.addText("“EAT, young man! Or do you have something to hide!”");
        builder.presentAndWait();
        builder.addText("Reluctantly, Hamlet takes the pheasant and takes a bite.");
        builder.presentAndWait();
        builder.addText("“Now swallow.”");
        builder.presentAndWait();
        builder.addText("“Damn you, woman,” Hamlet says. He swallows the pheasant. Only a few moments later, he is dead.");
        builder.presentAndWait();
        builder.addText("Gertrude and Claudius look down at Hamlet’s body. Before Gertrude can speculate, Claudius speaks up. “What unpleasant tidings have we. It seems that Hamlet disguised his madness so he could get some sort of misplaced vengeance on Laertes... he poisoned his own plate to give to Laertes! It was Hamlet!” He shakes his head and tuts. “I am so sorry for your son, Gertrude.”");
        builder.presentAndWait();
        builder.addText("“I am sorry too, to have produced such a schemer of a son. I suppose he takes after his father more,” Gertrude says.");
        builder.presentAndWait();
        builder.addText("Claudius smiles, thinking of how he poisoned his brother. “In more ways than one,” he says.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 46
        //----------------------------------------------------------------------
        builder.mark("S2O.46");

        builder.addText("Horatio remains loyal. “I stand with my lord,” he says to himself in a hoarse voice.");
        builder.presentAndWait();
        builder.addText("Hamlet looks over and sees Horatio as if for the first time. “Horatio. I have done it, Horatio. I shall be king.”");
        builder.presentAndWait();
        builder.addText("“And you have had revenge for your father, lord,” says Horatio.");
        builder.presentAndWait();
        builder.addText("Hamlet blinks. The room feels oppressively empty with only the two of them and the dead in it. “Oh yes. That’s true.” Hamlet looks away from Horatio. “For your help, Horatio, I am making you my chancellor. How does that sound? Certainly better than your current station, and a better man to be chancellor than the last one.” There is no life or warmth in his voice.");
        builder.presentAndWait();
        builder.addText("Horatio nods. He has no desire to challenge Hamlet. “I thank you, prince- no, king Hamlet. I will not let you down.”");
        builder.presentAndWait();
        builder.addText("Hamlet seems not to have heard him. He is covered in blood, too, but that does not seem to concern him either. “We will have to make changes in Denmark. Restructure things.”");
        builder.presentAndWait();
        builder.addText("Horatio lowers his head and says nothing. The man who was his friend is gone, but he cannot abandon him.");
        builder.presentAndWait();
        builder.addText("In the coming years they do these things. Denmark is made into an efficient machine of a state, and foreign affairs are rendered trifles as Norway and Poland are subjugated. Hamlet rules long, and challenges are few and bloodily met. As his side all the way is faithful Claudius, but rarely do the two speak outside of the affairs of government. There is no more to say.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 47
        //----------------------------------------------------------------------
        builder.mark("S2O.47");

        builder.addText("At the sight of the terrible carnage Hamlet has wrought, Horatio realizes that he has to do something... Before Hamlet can see him, Horatio slips away, bolting through the corridors of the castle, looking for someone with the power to stop the madman in the dining hall.");
        builder.presentAndWait();
        builder.addText("As he approaches the castle’s mighty doors, he hears the rumbling of drums outside. He pushes them open and sees a delegation of foreign soldiers marching through the gates of the castle. They bear the coat of arms of the royal family of Norway. At their head is a proud young man. He holds up a hand to halt the approach of the soldiers and calls out to Horatio. “Hail! This is prince Fortinbras of Norway- why have we received no welcome at our approach to Denmark!”");
        builder.presentAndWait();
        builder.addText("Horatio rushes up and falls to Fortinbras’s feet. “It is horrible!” he cries. “Prince Hamlet has gone mad and killed the royal family!”");
        builder.presentAndWait();
        builder.addText("Fortinbras needs no more. He and his soldiers storm past Horatio into the castle. There are the sounds of a struggle. After almost half an hour, Fortinbras emerges. Behind him, his troops carry the body of Hamlet, covered in sword wounds. They toss him to the ground at Horatio’s feet.");
        builder.presentAndWait();
        builder.addText("“I bested him in a swordfight,” Fortinbras declares. “It is a shame about his madness. Now Denmark belongs to Norway,” he says matter-of-factly. “I am sorry for the royal family.”");
        builder.presentAndWait();
        builder.addText("Horatio bends down and touches his friend’s cold, lifeless face. “And I am sorry for my role in things. I never knew Hamlet could give himself to vengeance so wholeheartedly... but maybe I deluded myself.”");
        builder.presentAndWait();
        builder.addText("Fortinbras looks down at Horatio sympathetically. “A pity what became of him. No one will blame you for mourning a man who was once good who fell to his vices.”");
        builder.presentAndWait();
        builder.addText("Horatio looks up. “You understand. Poor Hamlet was consumed by madness and grief... but I will not soon forget him.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 48
        //----------------------------------------------------------------------
        builder.mark("S2O.48");

        builder.addText("Hamlet, responding quickly, answers first.");
        builder.presentAndWait();
        builder.addText("“Claudius, this evil imposter, has spent the past months killing everyone who stood in his way of being king. He poisoned my father, King Hamlet, and when I discovered his plot, he attempted to kill me as well. Thankfully, my mother, Queen Gertrude, prevented me from being poisoned by this chalice or from being impaled by Laertes’ rapier. He will of course deny everything, but to show that I am telling the truth, have Claudius drink from what is left in this poisoned chalice. If he can do that, I will be resigned to my fate, but if not, that will be proof of my honesty!”");
        builder.presentAndWait();
        builder.addText("Fortinbras nods at his guards, who retrieve the goblet and advance towards Claudius. As they shove it towards his face, he shuts his mouth tightly and leans backwards.");
        builder.presentAndWait();
        builder.addText("“Claudius, will you drink?” asks Fortinbras.");
        builder.presentAndWait();
        builder.addText("After some moments of silence, Fortinbras commands his guards to assist in leading Claudius and Laertes away.");
        builder.presentAndWait();
        builder.addText("Relieved to see his foes gone, Hamlet motions for Gertrude to come closer, to address Fortinbras together. Before Hamlet can say anything, however, Gertrude begins talking to Fortinbras directly.");
        builder.presentAndWait();
        builder.addText("“My son, Hamlet, true heir to the kingdom, is now our rightful king. I relinquish my role as queen. Fortinbras, Hamlet, I wish that you should ally and that our kingdoms will be free from this long and damaging war. Claudius is no more, and our kingdom will be free from the curse of his reign.”");
        builder.presentAndWait();
        builder.addText("That night, Fortinbras and his armies retreat from Denmark, a new era of peace and prosperity between Norway and Denmark ushered in. The curse over the kingdom of Denmark was lifted, and the rest of the new King Hamlet’s reign was blessed by the heavens.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 49
        //----------------------------------------------------------------------
        builder.mark("S2O.49");

        builder.addText("Claudius, thinking quickly, speaks first.");
        builder.presentAndWait();
        builder.addText("“Hamlet is attempting a coup! He conspired with my treacherous wife, and together they are trying to have us jailed, so that they can reign together. Hamlet has been mad for a long time now, but this is truly more than I ever expected from his insanity. Laertes can prove these claims, for he picked up Hamlet’s poisoned sword, that he planned to use against us both!”");
        builder.presentAndWait();
        builder.addText("“Yes, my liege, everything that Claudius says is true! Save us from this madman and his plot to become king! Hamlet’s sword must be poisoned by the same compound he used to dispatch his father, for my wounds burn with a fire hotter than anything I have ever felt before!”");
        builder.presentAndWait();
        builder.addText("Fortinbras, turning towards Hamlet, sees the anger in his features, making him shake with rage, and begins to think that Hamlet might be insane. Rushing towards him, sword in hand, Fortinbras shouts at the top of his lungs.");
        builder.presentAndWait();
        builder.addText("“Danish scum, prepare to die!”");
        builder.presentAndWait();

        builder.addOption("Hamlet wins", "S2O.58");
        builder.addOption("Fortinbras wins", "S2O.59");
        builder.addOption("Hamlet and Fortinbras kill each other", "S2O.60");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 50
        //----------------------------------------------------------------------
        builder.mark("S2O.50");

        builder.addText("Hamlet, holding Claudius at swordpoint, demands for him to confess what he has done. Claudius, nervously, tries to stall; if the guards can arrive before Hamlet does something rash, he can still survive this.");
        builder.presentAndWait();
        builder.addText("“No, of course not, it was not intentional in the slight-”");
        builder.presentAndWait();
        builder.addText("Realizing that he made a misstep, seeing the anger in Hamlet’s eyes, he backs up as far as he can move in his chair, and calls for the guards at the top of his lungs.");
        builder.presentAndWait();
        builder.addText("Hamlet, furious, screams: “I will see you dead yet!” as he brandishes his sword. With one fell swoop, he cuts Claudius straight through the chest, killing him instantly.");
        builder.presentAndWait();
        builder.addText("As Hamlet is in the midst of killing the king, Laertes stands a few feet off, well aware of the fact that if he makes even the slightest mistake while dealing with Hamlet, he could be next. Hamlet stares at the dead body and a smile creeps across his face; Laertes, pondering his options, realizes that he only has two choices: kill Hamlet, or run.");
        builder.presentAndWait();

        builder.addOption("Laertes tries to kill Hamlet", "S2O.61");
        builder.addOption("Laertes runs for it", "S2O.62");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 51
        //----------------------------------------------------------------------
        builder.mark("S2O.51");

        builder.addText("Laertes attacks! His left hand twitches...");
        builder.presentAndWait();

        builder.addOption("Dodge left", "S2O.63");
        builder.addOption("Dodge right", "S2O.64");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 52
        //----------------------------------------------------------------------
        builder.mark("S2O.52");

        builder.addText("While he still has strength in his body, Hamlet forces the poisoned chalice to Claudius’s lips. He watches with cathartic glee as Claudius swallows the wine, panics, and slowly fades away. Soon his hand goes slack, and he breathes no more. Hamlet collapses to the ground and presses his hand to his poisoned wound. He doesn’t have long now, either...");
        builder.presentAndWait();
        builder.addText("Horatio rushes over to Hamlet and holds him as he lies dying on the floor. “Oh, my gentle lord...”");
        builder.presentAndWait();
        builder.addText("“I am dying, Horatio,” Hamlet chokes out. “Nothing can stop that now. But please, if I am to go, you must be the one to tell the truth of my life, so that my death may not be the end of me.”");
        builder.presentAndWait();
        builder.addText("“Hamlet, lord, no! I would rather join you in death,” Horatio moans. “Where’s that goblet... maybe there’s more poison in it yet...”");
        builder.presentAndWait();
        builder.addText("Hamlet shakes his head and waves with what little strength he has left. “No, Horatio! If you love me you will not... you were the best of us, Horatio, and I trust you to tell our tale, to hold our memory. Promise me, Horatio.”");
        builder.presentAndWait();
        builder.addText("Horatio nods solemnly, holding back tears. “Yes, lord Hamlet.”");
        builder.presentAndWait();
        builder.addText("There is a sound at the door to the throne room. The great doors open to admit a noble personage. With his last breath, Hamlet asks Horatio, “Who is that, Horatio? Who now enters this place of death?”");
        builder.presentAndWait();

        builder.addOption("Fortinbras arrives", "S2O.65");
        builder.addOption("Someone else arrives", "S2O.66");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 53
        //----------------------------------------------------------------------
        builder.mark("S2O.53");

        builder.addText("Hamlet, with shaking hands, holds the goblet to Claudius’ mouth, but in his haste to force Claudius to drink, and holding a sword in the other hand, he spills the poisoned drink on the floor. As Claudius sits on his throne, relieved, Hamlet realizes that he only has one chance to finish Claudius off. He leans forward, hoping to fall forward and stab Claudius, but instead he drops the poisoned rapier.");
        builder.presentAndWait();
        builder.addText("As his vision starts to fade, he sees Claudius standing over him, motioning to the guards to take Hamlet’s corpse away.");
        builder.presentAndWait();
        builder.addText("“Well, despite all your planning, treason, and “madness,” you lie dead on the floor and I am still king. Guards, take the body of the traitor and throw it in the same river as the one his lover perished in.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 54
        //----------------------------------------------------------------------
        builder.mark("S2O.54");

        builder.addText("Horatio speaks up, realizing that this could be his only chance. He begins to address Fortinbras directly, knowing that if he does not speak now, he will surely be killed by Claudius.");
        builder.presentAndWait();
        builder.addText("“King of Norway, this scoundrel in front of you was the one that caused this. He murdered old King Hamlet, and to cover up his evil deeds, killed everybody in this room. His wife, Gertrude, died after drinking from one of the cups at his table, his friend’s son, Laertes, was killed with what appeared to be symptoms of poisoning, of which his nephew, Hamlet, died as well.”");
        builder.presentAndWait();
        builder.addText("Fortinbras furrows his brow.");
        builder.presentAndWait();
        builder.addText("“These are serious accusations, do you have any proof of this? I have had my eye on Claudius for a while now, but unless you have any proof, I don’t feel comfortable risking this tenuous peace for such unfounded accusations.”");
        builder.presentAndWait();
        builder.addText("Horatio, realizing that there is no direct proof of Claudius’ misdeeds, looks Claudius directly in the eyes. Claudius has a slight smirk on his face, and Horatio, realizing that he has no proof, hangs his head. Fortinbras turns back and says:");
        builder.presentAndWait();
        builder.addText("“Well, if there is no proof, I have no other choice than to take you into captivity for attempted treason against your king. Guards, seize him!”");
        builder.presentAndWait();
        builder.addText("As the guards drag Horatio away to spend the rest of his life in prison, Claudius addresses Fortinbras with an attempted peace offering.");
        builder.presentAndWait();
        builder.addText("“Now that we’ve put those unfounded claims behind us, we should talk about this war. I know that you are a reasonable man, and are we really so different that we cannot resolve this dirty business between us? Our armies would be far better together, would they not? Your kingdom only had issue with old King Hamlet, and now that all his family is gone and I am king over the land, can we not resolve to stop this war between us and rule in peace?”");
        builder.presentAndWait();
        builder.addText("Fortinbras, in disbelief as to what he is witnessing, disagrees vehemently.");
        builder.presentAndWait();
        builder.addText("“My army surrounds your castle, and you dare to offer an alliance? Besides, even though your servant had no proof, the notion that you could be responsible for the deaths of so many is something that I can certainly believe. I could have you killed right now and put a puppet in your place, and nobody would bat an eye! However, you do know the wishes of the public, you can speak their language, and you are part of the royal family. As I cannot rule over two distant kingdoms at once, I will let you rule over Denmark as a puppet to my government. If you disagree, the war against what little is left of your kingdom will continue.”");
        builder.presentAndWait();
        builder.addText("Claudius, realizing that he has no other choice, accepts Fortinbras’ terms. His plot to be king will never be fully realized, but at least he will be able to continue to govern over Denmark. In the end, Hamlet and Horatio were still able to foil Claudius’ plans, even if indirectly.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 55
        //----------------------------------------------------------------------
        builder.mark("S2O.55");

        builder.addText("Claudius starts talking with Fortinbras immediately, and Horatio decides that Fortinbras seeing him disrespecting his king would be bad for his credibility. Horatio can explain what has happened later, in private.");
        builder.presentAndWait();
        builder.addText("“Hamlet’s madness was well known around the kingdom. He began to lose his sanity with the death of his father, and at the death of Ophelia, he completely lost his mind. He had Rosencrantz and Guildenstern, his dearest friends, murdered, and then returned and began attacking people. This man, Horatio, was his enabler; he believed everything that Hamlet said, which made him even more mad. This latest occurrence is reason enough to deport him from our kingdom, as a traitor to his country.”");
        builder.presentAndWait();
        builder.addText("Horatio begins to protest, but Fortinbras, nodding in agreement, signals to his guards, who advance on Horatio, dragging him away. Claudius, pleased with himself, begins talking to Fortinbras about the kingdoms.");
        builder.presentAndWait();
        builder.addText("“Are we really so different that we cannot resolve this dirty business between us? Our armies would be far better together, would they not? Your kingdom only had issue with old King Hamlet, and now that all his family is gone and I am king over the land, can we not resolve to stop this war between us and rule in peace?”");
        builder.presentAndWait();
        builder.addText("Fortinbras, in disbelief as to what he is witnessing, disagrees vehemently.");
        builder.presentAndWait();
        builder.addText("“My army surrounds your castle, and you dare to offer an alliance? I could have you killed right now! However, you do know the wishes of the public, you can speak their language, and you are part of the royal family. As I cannot rule over two distant kingdoms at once, I will let you rule over Denmark as a puppet to my government. If you disagree, the war against what little is left of your kingdom will continue.”");
        builder.presentAndWait();
        builder.addText("Claudius, realizing that he has no other choice, accepts Fortinbras’ terms. His plot to be king will never be fully realized, but at least he will be able to continue to govern over Denmark. In the end, Hamlet still was able to foil Claudius’ plans, even if indirectly.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 56
        //----------------------------------------------------------------------
        builder.mark("S2O.56");

        builder.addText("Hamlet avenges his father while he has the chance. He leaps forward, knocking into Claudius and throwing him to the ground. To his mother’s horror, he pulls out a knife and quickly plunges it through Claudius’s heart. Claudius sputters and breathes his last.");
        builder.presentAndWait();
        builder.addText("There is silence. Hamlet slowly turns around. The expressions he sees in the others surprise him. There is no surprise, there is no fear, there is no anger. All around him, Hamlet is faced with overwhelming disappointment.");
        builder.presentAndWait();
        builder.addText("Gertrude speaks sharply. “Well Hamlet, you have had your revenge. I know you hate Claudius... you have never been subtle about it. I hope you’re happy. Because of you, I never will be.” She motions quickly and guards enter the room. They seize Hamlet and drag him away before he has a chance to respond.");
        builder.presentAndWait();
        builder.addText("Gertrude turns around to face Laertes, whose face is now downcast. “Laertes, Claudius was always fond of you. You have suffered much at my son’s hands. I know you blame him for Ophelia’s death, and I watched him murder your father myself... poor man. Perhaps I can do something for you.”");
        builder.presentAndWait();
        builder.addText("She approaches and places her hands in Laertes’s. He looks up to meet her gaze. “With prince Hamlet a criminal and king Claudius dead, Denmark is without heirs to the throne. I will rule for a while, but I am old. Would you take the chance to inherit the crown when I die?”");
        builder.presentAndWait();
        builder.addText("Laertes ponders this quietly for a moment before nodding his head. “Yes, my queen.");
        builder.presentAndWait();
        builder.addText("“Very good, prince Laertes.” Gertrude smiles. “I can think of no-one better to inherit the crown of Denmark.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 57
        //----------------------------------------------------------------------
        builder.mark("S2O.57");

        builder.addText("At that moment, Hamlet decides to put his father’s death behind him.");
        builder.presentAndWait();
        builder.addText("“My liege, with Laertes bested, I place this knife and rapier before you.” he says, laying down his weapons. “My feud with Laertes is over, and I wish to appeal to your majesty. For the first time in a long time, I feel well. I apologize for my erratic behavior, and forgive any dirty business that may have occurred in the past.”");
        builder.presentAndWait();
        builder.addText("Claudius, realizing that his biggest foe can become his biggest ally if he grants Hamlet leniency, agrees immediately.");
        builder.presentAndWait();
        builder.addText("“Yes, yes, of course! Guards, take Laertes from our presence. As the son of the former king, your royal blood makes you a most suitable heir to the throne, as well. We shall speak of this more during a private dinner; come forth my son. Guards, seize Laertes!”");
        builder.presentAndWait();
        builder.addText("Laertes protests his innocence as the guards come. Gertrude ignores him and places a hand on Hamlet’s shoulder. “My son, I am so proud of you. Your grief is behind you now. It can no longer haunt you.”");
        builder.presentAndWait();
        builder.addText("After dinner that night, when Claudius and Hamlet had finished discussing their new plan to rule the kingdom together, Hamlet retired to bed alone. He felt a twinge of guilt, but it was nothing compared to the joy he felt at being the heir to the throne. With Claudius and Gertrude so old, it was unlikely they would ever have a son who could assume the throne, and a few more years of waiting would be nothing compared to how long Hamlet had waited already.");
        builder.presentAndWait();
        builder.addText("As Hamlet drifted off, the ghost of his father entered the room. It neared Hamlet, and began to lecture the prince, pleading with him to kill Claudius and avenge his father. Hamlet, sleeping soundly, dreaming of his kingdom-to-be, didn’t hear a thing.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 58
        //----------------------------------------------------------------------
        builder.mark("S2O.58");

        builder.addText("Hamlet acts quickly and wins the day. Fortinbras is a good duelist, but Hamlet has been on edge all day, having had to deflect trickery all day to survive. And this is no duel, as it was before- Hamlet strikes decisively, and before Claudius knows it, Fortinbras is cut down.");
        builder.presentAndWait();
        builder.addText("Hamlet then turns to Claudius, eyeing him up. The old man cringes and sinks into his throne, fearing the worst. And he is right to fear- Hamlet sets upon him without another word.");
        builder.presentAndWait();
        builder.addText("Laertes sees what Hamlet is doing and jumps in with his blade at the ready, but he is too late- Claudius is defenseless, and Hamlet cuts him open. Claudius coughs blood and goes still.");
        builder.presentAndWait();
        builder.addText("Now Hamlet turns to Laertes. Both are tired from the duel, but Hamlet is running on pure adrenaline. Laertes is the better fighter, but he doesn’t stand a chance against Hamlet’s wild fury. He lasts longer against Hamlet than Fortinbras and Claudius combined, but in the end he gives himself away. His left hand twitches, but Hamlet dodges right, trips him, and brings his sword down through Laertes’s abdomen. Laertes falls to the ground and bleeds out.");
        builder.presentAndWait();
        builder.addText("At last, Hamlet takes a breath. Gertrude comes up, embraces him, and calls for some water for him. “Hamlet, are you okay? That was a difficult battle you fought.”");
        builder.presentAndWait();
        builder.addText("Before he can answer, Horatio rushes up. “My lord, the castle is under attack! Fortinbras’s soldiers are enraged that you killed him- they are besieging the castle, ransacking the city, and sending for reinforcements from Norway! Come away, before they break through!”");
        builder.presentAndWait();
        builder.addText("Hamlet looks at Gertrude wearily. “Well, mother,” he says dryly, “that should tell you about how I’m doing.”");
        builder.presentAndWait();
        builder.addText("Thus did the chaotic, war-torn reign of king Hamlet II begin with bloodshed.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 59
        //----------------------------------------------------------------------
        builder.mark("S2O.59");

        builder.addText("Hamlet fights valiantly, but the fight goes against him. He is already tired from his duel with Laertes, and Fortinbras is fresh and ready to battle. Before the eyes of the assembled court, Fortinbras disarms the Danish prince and forces him to the floor.");
        builder.presentAndWait();
        builder.addText("Fortinbras levels his blade at Hamlet’s throat. “Any last words, prince Hamlet?”");
        builder.presentAndWait();
        builder.addText("Hamlet sighs. “Not to be, it is.”");
        builder.presentAndWait();
        builder.addText("Fortinbras wrinkles his brow. “I don’t know what that means. No matter.” He finishes Hamlet quickly, with a minimum of suffering. He stands up over Hamlet’s body and turns to the throne. Claudius is ecstatic. Gertrude looks like she’s seen a ghost. Slowly, Fortinbras approaches Claudius and kneels, offering the sword that killed prince Hamlet to him. Claudius takes it and lightly taps Fortinbras’s shoulders with the end.");
        builder.presentAndWait();
        builder.addText("“Rise, Fortinbras. You have done the state of Denmark a great service today, one that will not be easily forgotten. You are always welcome here, and Denmark celebrates that we have a friend in Norway.” Claudius gestures to castle guards and points them to Gertrude. She struggles as they take her roughly by the arm.");
        builder.presentAndWait();
        builder.addText("Fortinbras lowers his head. “May these tragic circumstances bring peace.”");
        builder.presentAndWait();
        builder.addText("Claudius watches as Gertrude is hauled away to the dungeon. She cries out for Hamlet. When Horatio goes to help her, the guards beat him away. “Yes,” Claudius responds. “Peace at last.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 60
        //----------------------------------------------------------------------
        builder.mark("S2O.60");

        builder.addText("Hamlet and Fortinbras are equally skilled. Fortinbras is a less skilled duelist than Hamlet, but Hamlet is exhausted from the duel with Laertes and the excitement of exposing Claudius. As the king and assembled members of the court watch, the two young princes spar back and forth, with their strikes and breathing growing heavier as the battle progresses.");
        builder.presentAndWait();
        builder.addText("Metal clashes against metal for many long, tense minutes, but eventually Hamlet finds an opening. He feints to the right, knocks Fortinbras’s hand away, and slashes his stomach. Hamlet steps back, triumphant, and turns around.");
        builder.presentAndWait();
        builder.addText("But Fortinbras still has life in him. As he bleeds out, Fortinbras stumbles forward and lays into prince Hamlet while he is distracted by his victory. What Fortinbras lacks in strength, he makes up for with momentum. By the time his blade runs clean through Hamlet’s gut, Fortinbras is already dead. The two princes collapse in a heap, thoroughly gone.");
        builder.presentAndWait();
        builder.addText("A tense silence comes over the court. Eventually, Claudius stands. “It was valiant of prince Fortinbras to come to my aid against the renegade prince Hamlet... but now let us put this bloodshed behind us. I’m sure there will be no more objections to my reign as legitimate king of Denmark-”");
        builder.presentAndWait();
        builder.addText("At that moment, Osric the messenger comes rushing in. “King Claudius, make haste! News of Fortinbras’s death has reached the Norwegian troops outside- they want revenge! They are attacking the castle- you must hide!”");
        builder.presentAndWait();
        builder.addText("Claudius looks around at the court. Gertrude glares hatefully at him and leaves without another word. Guards rush past him to fend off the Norwegian soldiers. Osric has a panicked expression on his face.");
        builder.presentAndWait();
        builder.addText("“They say no good deed goes unpunished,” Claudius sighs. “And now, I am being punished for Fortinbras’s sacrifice. Let Norway come, then! I have seen many deaths already. War will be nothing new.”");
        builder.presentAndWait();
        builder.addText("Thus did the reign of king Claudius begin with assassinations and bloodshed in the court and descend into war.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 61
        //----------------------------------------------------------------------
        builder.mark("S2O.61");

        builder.addText("With Hamlet distracted by his triumph over his uncle, Laertes seizes the moment. Snatching his poisoned foil from the floor, he sprints over to the unsuspecting prince. By the time Hamlet turns around, it is too late. Laertes plunges at Hamlet, piercing him through with the sword.");
        builder.presentAndWait();
        builder.addText("Hamlet gawks at Laertes and reaches out, trying to grab at Laertes. But the strength leaves his body before he can wrest control of the situation. With his last breath, he pities his killer. “Oh, Laertes. You were a good man. I believed you when you pardoned my wrongs against you... I only hope that in my death you may find peace.”");
        builder.presentAndWait();
        builder.addText("Laertes steps back and lets go as Hamlet dies, his body crumpling to the floor. He looks at his hands. Thoughts race through his head - Hamlet’s uncharacteristically kind last words have shaken him. He sinks to his knees. “All I wanted was justice for Ophelia, and for my father...”");
        builder.presentAndWait();
        builder.addText("At that moment, there is a clattering at the door. The heavy doors are flung open, and in, with his finery and his personal guard, marches prince Fortinbras of Norway. He and his entourage look around at the chaos and dead bodies in the court.");
        builder.presentAndWait();
        builder.addText("“I expected a warmer welcome than this...” the prince intones. “What on Earth has happened here?”");
        builder.presentAndWait();
        builder.addText("From the sidelines steps Horatio, as shaken as Laertes but with less guilt on his conscience. “Prince Fortinbras! I regret that you find our court in such disarray.  Great tragedies have befallen Denmark of late... I tell you that king Claudius conspired to kill our noble prince Hamlet, and with the help of this man,” he says, pointing an accusing finger at Laertes, “he did do so. Never was there so good a man as Prince Hamlet, I swear.”");
        builder.presentAndWait();
        builder.addText("Laertes is too shocked to speak up in his own defense. Fortinbras marches over and looks down at him in disdain. He speaks a few terse words to his guards, who march over and seize Laertes. As he is led away, he hears Fortinbras proclaiming Denmark’s throne to be his own as a vassal of Norway.");
        builder.presentAndWait();
        builder.addText("“Hamlet’s story will be told for future generations,” Fortinbras continues. “His was a keen mind, and shall be missed.”");
        builder.presentAndWait();
        builder.addText("Horatio sighs. “He was so close to the throne... at least he succeeded in his task. His father’s ghost may rest now.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 62
        //----------------------------------------------------------------------
        builder.mark("S2O.62");

        builder.addText("Seeing his patron killed, Laertes panics. “How did things come to this?” he mutters. “I cannot make things right!” He struggles to his feet, grabs his sword, and sprints towards the heavy doors of the throne room.");
        builder.presentAndWait();
        builder.addText("Hamlet turns and sees Laertes on the run. He narrows his eyes. “Guards!” he yells, pointing at Laertes. “Give chase! He no doubt was part of Claudius’s scheme against me!” The guards bring their weapons up and run after him.");
        builder.presentAndWait();
        builder.addText("Laertes flees through the winding halls of the castle, panting desperately as the clanking footsteps of the castle guard thunder in the echoey corridors behind him. He is nearly out of breath, but soon enough he sees the exit. He blows through the door, but someone blocks the way...");
        builder.presentAndWait();
        builder.addText("Without thinking, Laertes swings his sword and strikes down the obstacle in his way. The castle guard stops and stares at his victim in shock, leaving him to escape to the town and disappear.");
        builder.presentAndWait();
        builder.addText("In the castle, Hamlet smiles to himself. With his father avenged, he can reclaim the throne and take his rightful place. However, his reverie is interrupted by the entrance of a guard. He is sweating profusely and appears to be bleeding from his side.");
        builder.presentAndWait();
        builder.addText("“My lord, terrible news! Laertes has escaped!”");
        builder.presentAndWait();
        builder.addText("“Well, find him in the town! Do not give up your task yet!”");
        builder.presentAndWait();
        builder.addText("“But my king, we cannot make it to the town! We are under attack! In his frenzy to escape, Laertes stumbled upon a delegation of foreign soldiers. He has killed Prince Fortinbras of Norway, and now his troops besiege the castle!”");
        builder.presentAndWait();
        builder.addText("Hamlet turns pale. “So this is Laertes’s revenge in action... he hardly knows what he has done. Now, in my first moments as king, must I go to war with Norway!” He wanders back to his throne depressedly. “The struggle never ends.”");
        builder.presentAndWait();
        builder.addText("Thus did Norway and Denmark engage in long and bloody war, and King Hamlet II reigned over more difficult times than he ever did deserve.");
        builder.presentAndWait();
        builder.addText("As for Laertes, none know what became of him. He was never seen after his disappearance.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 63
        //----------------------------------------------------------------------
        builder.mark("S2O.63");

        builder.addText("...back into Laertes’ foil. He curses at his mistake and reels back, shuddering. In addition to his first injury, which is still bleeding as freshly as when it was first opened, Hamlet now bears another. This one is much deeper than before. He looks down into his gouged flesh and feels dizzy...");
        builder.presentAndWait();
        builder.addText("He picks up his sword for another go around, but the room seems to go around him, swimming and spinning. Numb all over, bleeding out, poison swimming through his veins, Hamlet sinks to the floor and breathes his last.");
        builder.presentAndWait();
        builder.addText("Laertes looks over at Claudius, who is no longer holding back his glee at Hamlet’s death.");
        builder.presentAndWait();
        builder.addText("Thus ends the life of Prince Hamlet the dane, who challenged a superior swordsman and lost.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 64
        //----------------------------------------------------------------------
        builder.mark("S2O.64");

        builder.addText("Hamlet dodges the strike, Laertes stabs and kills Claudius instead. Hamlet kills Laertes and becomes king, but is slightly troubled that he was not the one to kill his father’s killer.");
        builder.presentAndWait();
        builder.addText("...out of the way. Claudius, who Hamlet was holding, is not so lucky. Laertes’ foil goes straight through his chest. With his last breaths, he shouts at Laertes to finish Hamlet off. However, in his panic, Laertes has left the sword in the corpse of Claudius, reeling back at what he has done. Hamlet, thinking quickly, slides the blade out of the chest of the king’s body, and, swinging the sword quickly around, cuts Laertes with the poisoned blade. As Laertes falls backwards, gasping for breath, Hamlet hits him again, quickly ending his life.");
        builder.presentAndWait();
        builder.addText("The audience in the room, shocked at the sudden deaths of Claudius, Laertes, and Gertrude, begin to scream and rush out of the room. Hamlet, alone in the room, realizing that he will soon become king, all of his enemies vanquished, and his father avenged, is overjoyed. However, in the back of his mind, he still feels guilty; Laertes was the one to kill Claudius, not him. Even in his victory, the bitter aftertaste of defeat still lingers, and for the rest of his reign, he will always feel disappointed that he was not the one to finish Claudius himself.");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 65
        //----------------------------------------------------------------------
        builder.mark("S2O.65");

        builder.addText("“It is Fortinbras, prince of Norway, who enters, prince Hamlet,” says Horatio. He looks down at his prince. Hamlet is dead. The sound of drums rolls in from the door as if to announce his departure.");
        builder.presentAndWait();
        builder.addText("Horatio, full of grief, stares blankly at the door as the music gets louder and louder. Fortinbras enters with full regalia behind him. As Fortinbras enters the room, a look of disgust and horror creeps across his face.");
        builder.presentAndWait();
        builder.addText("“What on earth happened in here? Is everybody dead?”");
        builder.presentAndWait();
        builder.addText("Horatio responds sadly. “What you see here is already gone. Only grief is left.”");
        builder.presentAndWait();
        builder.addText("Ambassadors from England greet Horatio as well, apologetic for whatever events have transpired, and assure him that Rosencrantz and Guildenstern are dead. Horatio is little cheered by this information, even though they had orders for Hamlet’s death. He informs Fortinbras and the ambassadors as to what has transpired in Denmark.");
        builder.presentAndWait();
        builder.addText("“King Claudius, who is now dead, killed old King Hamlet, and then in his efforts to conceal the truth, plotted to kill Prince Hamlet as well. As a result of his plans, he himself, along with Prince Hamlet, Queen Gertrude, and far more innocent victims, were killed only an hour or so ago.”");
        builder.presentAndWait();
        builder.addText("Fortinbras, in disbelief, charges Horatio to tell him everything that happened, down to the most minute detail. At the end of his story, he takes a deep breath and sighs.");
        builder.presentAndWait();
        builder.addText("“It seems that Prince Hamlet died a most honorable death, and in doing so revealed the treachery of king Claudius to the world. With no one to fill the throne, I shall take it for myself, so that Denmark may prosper under the rule of Norway.” He looks down at Hamlet’s body and gestures to his officers. “Take Hamlet away. For his valor, he shall receive full military honors at his funeral.” He shakes his head. “What terrible tragedy has befallen this place. Our only condolence is that it is now over.”");
        builder.presentAndWait();
        builder.addText("Horatio watches with pain as his friend is taken away. “Good night, sweet prince.”");
        builder.presentAndWait();

        builder.jumpTo("END");

        //----------------------------------------------------------------------
        // 66
        //----------------------------------------------------------------------
        builder.mark("S2O.66");

        builder.addText("“It is... Ophelia?” says Horatio. He looks down at his prince. Hamlet is dead.");
        builder.presentAndWait();
        builder.addText("Ophelia walks through the open doors and looks around. “What misery has transpired here? ...Is that prince Hamlet?” She rushes over to join Horatio at Hamlet’s corpse. “Horatio, you must tell me. What on earth happened while I was gone?”");
        builder.presentAndWait();
        builder.addText("Horatio stares at her blankly. “...While you were gone? You were dead, my lady!”");
        builder.presentAndWait();
        builder.addText("“Oh. Well.” Ophelia waves dismissively. “I certainly had a bad turn in the river, but the water did me some good. It refreshed my senses and cleared my mind. The worst part was waking up in that awful coffin, ugh! Actually, if everyone thought I was dead, that explains a lot.” She taps her chin. “Awfully inconsiderate of you not to check if I was truly dead, though.”");
        builder.presentAndWait();
        builder.addText("Horatio stares open-mouthed, barely comprehending. She looks at him with annoyance. “Horatio, don’t give me that look. What happened here? Why are all of these people dead?” She looks across the room and sees Laertes stretched across the ground, dead from his poisoned stab wound. “Oh my... Laertes too?!”");
        builder.presentAndWait();
        builder.addText("Horatio recovers himself. “It is a sorry story, my lady, but in short, king Claudius schemed to kill prince Hamlet with poison. He turned your brother to his side to aid him in his plot-” he holds up a hand as Ophelia whips around to look at him “-but in the end Laertes betrayed him and revealed the plot, though he, too, was taken by the poison.”");
        builder.presentAndWait();
        builder.addText("Ophelia looks down. “It is indeed a sorry story, Horatio, but I take some small relief in Laertes’s virtue shining through in the end, even if it was too late. Now, Horatio, it is for us, the living, to spread this tale and warn others against the dangers of lusting for power, as Claudius did when he killed his brother.”");
        builder.presentAndWait();
        builder.addText("Horatio blinks. “How did you know about Claudius killing his brother?”");
        builder.presentAndWait();
        builder.addText("She shrugs. “Old King Hamlet told me himself while I was stuck in the coffin.”");
        builder.presentAndWait();

        builder.jumpTo("END");
    }
}
