// Scene 1
public class GameContentScene1 {
    static void build(GameBuilder builder) {
        //----------------------------------------------------------------------
        // 1
        //----------------------------------------------------------------------
        builder.addText("It is a cold night in the churchyard. The only noise that pierces through the darkness is the clinking of shovels as two gravediggers stab at the frozen earth. The more haggard of the two, a grizzled old man, stops to wipe his brow with a shivering hand.");
        builder.presentAndWait();
        builder.addText("“So she gets a Christian burial, even after all that.”");
        builder.presentAndWait();
        builder.addText("The younger gravedigger’s shovel hesitates at the sound of his voice, moving on after a few seconds. “She’s nobility. She deserves nothing less.”");
        builder.presentAndWait();
        builder.addText("The older gravedigger gives his companion a wry eye as they keep at their work. “She certainly deserves nothing more. If I drowned myself, you wouldn’t see me getting this honorable burial.”");
        builder.presentAndWait();
        builder.addText("Clink. “It could have been an accident.”");
        builder.presentAndWait();
        builder.addText("“Yes, maybe she climbed that rotting branch hanging over the river by accident. Doesn’t matter to me. Lots of accidents in Denmark these days. Old King Hamlet accidentally dies in his sleep. Claudius, his brother, accidentally gains the throne of Denmark; the true heir, Hamlet the younger, accidentally doesn’t return from his trip to England. Our land has been cursed ever since the death of our king.”");
        builder.presentAndWait();
        builder.addText("Clink. “You think too much ill, old man.”");
        builder.presentAndWait();
        builder.addText("“For a gravedigger, you don’t think ill enough.”");
        builder.presentAndWait();
        builder.addText("Clink. The younger digger puts his shovel down. “You talk like there’s no way to prevent things from getting worse.”");
        builder.presentAndWait();
        builder.addText("The leaves in the churchyard rustle with a gust of wind. “Maybe there is, maybe there isn’t,” the older replies. “That’s not for me to know. It won’t be my choices that make things better. But maybe yours will.”");
        builder.presentAndWait();
        builder.addText("“Really, me? What can I do in such unhappy times?”");
        builder.presentAndWait();
        builder.addText("The old gravedigger smirks. “You can get me a drink. Begone”");
        builder.presentAndWait();
        builder.addText("The younger huffs and steps away from the coffin-shaped hole, rubbing the cold out of his shoulders. Off in the distance, two men approach each other and begin to converse.");
        builder.presentAndWait();
        builder.addText("“I can’t tell you how glad I am to see you, friend. But how did you escape your doom?”");
        builder.presentAndWait();
        builder.addText("“Horatio, you would hardly believe your ears if I told you. King Claudius, my uncle, hoped I would die in that voyage to England. I managed to find the letter ordering my execution before it could be delivered by my old “friends” Rosencrantz and Guildenstern. If I had not I surely would be dead now.”");
        builder.presentAndWait();
        builder.addText("The gravedigger, having overheard the conversation, approaches. “Who enters the cemetery at this hour of the night? Ceremonies don’t start until daybreak!”");
        builder.presentAndWait();
        builder.addText("One of the men draws forwards and adjusts his hat. “None other than I, Hamlet, Prince of the Danes!”");
        builder.presentAndWait();
        builder.addText("“And, how, Prince of the Danes,” asks the gravedigger, “did you survive your execution?”");
        builder.presentAndWait();

        builder.addOption("“I rewrote the letter to order Rosencrantz and Guildensterns’ deaths instead!”", "S1.2");
        builder.addOption("“I burned the letter!”", "S1.3");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 2
        //----------------------------------------------------------------------
        builder.mark("S1.2");

        builder.addText("“I rewrote the letter to order Rosencrantz and Guildensterns’ deaths instead of my own!”");
        builder.presentAndWait();
        builder.addText("Hamlet’s companion, Horatio, breathes in slightly. The gravedigger raises his eyebrow. “A bit extreme, I think.”");
        builder.presentAndWait();
        builder.addText("“Nonetheless, I did what I had to and it worked.” Hamlet sighs and shakes his head. “What I did won’t help me sleep, but I’ve had no rest anyway since Claudius killed my father.”");
        builder.presentAndWait();
        builder.addText("“You say Claudius killed your father? That’s a bold claim to make,” says the gravedigger. “But if you’re looking for rest, you’ve found the right place.” He gestures to the churchyard, full of faded headstones and gloomy mausoleums.");
        builder.presentAndWait();
        builder.addText("“I suppose... but what man’s grave is this that you’re digging?” asks Hamlet.");
        builder.presentAndWait();
        builder.addText("The gravedigger looks down at the dark pit. “No man’s, sir.”");
        builder.presentAndWait();
        builder.addText("“What woman, then?”");
        builder.presentAndWait();
        builder.addText("“No woman.”");
        builder.presentAndWait();
        builder.addText("“What is being buried here, then?”");
        builder.presentAndWait();
        builder.addText("The gravedigger gives a grim smile. “What was a woman, sir, but bless her, she’s dead now.”");
        builder.presentAndWait();
        builder.addText("Hamlet hangs his head. “Perhaps you can tell us who this woman was?”");
        builder.presentAndWait();
        builder.addText("“Perhaps you can find out, sir, in just a moment.” The gravedigger packs up his shovel and walks away, looking over his shoulder at Hamlet and Horatio. “The funeral party arrives at daybreak.”");
        builder.presentAndWait();
        builder.addText("Hamlet and Horatio look at each other as the gravedigger disappears into the churchyard, chuckling to himself. “Come, Horatio, behind these bushes. Let’s watch the funeral and find out who was being buried on such a chilling night.”");
        builder.presentAndWait();
        builder.addText("“Yes, my lord,” Horatio replies. They pass several gray headstones, on their route to a thicket at the edge of the graveyard.");
        builder.presentAndWait();
        builder.addText("“Why, Horatio, I recognize some of these headstones. People I knew in the past... that is Yorick, a jester I remember from my youth. I used to listen to his jokes; many times he would give me piggyback rides, and yet look at him now.” Hamlet’s face falls. “He lies in such a cold, silent place. A man of such warmth deserved better, yet here he lies.”");
        builder.presentAndWait();
        builder.addText("“I’m sorry, lord,” says Horatio. “But look, here the funeral party comes!”");
        builder.presentAndWait();
        builder.addText("“Here to add to the dead,” Hamlet says gloomily.");
        builder.presentAndWait();
        builder.addText("The procession arrives, and to his surprise Hamlet recognizes many of the faces in the small crowd. Following the priest is his treacherous uncle Claudius, King of Denmark; his mother, the unfaithful queen Gertrude; and Laertes, sister of Ophelia and son of Polonius, who Hamlet killed.");
        builder.presentAndWait();
        builder.addText("And the body... Hamlet’s face turns as white as the gravestones around him. “That... is my beloved Ophelia.”");
        builder.presentAndWait();
        builder.addText("From afar, Hamlet and Horatio cannot hear the words of the mourners in the pale moonlight. Gertrude says some words, tears streaming down her face. The casket is lowered into the pit.");
        builder.presentAndWait();
        builder.addText("Not all is right. Laertes seems to be arguing with the priest over something. “His emotions must be high... after all Ophelia was his sister,” says Horatio. “Poor man.” Laertes does not stop arguing. He raises his fists, begins to yell.");
        builder.presentAndWait();
        builder.addText("Suddenly, tears streak down his face. With a cry, Laertes throws himself into the pit onto the coffin, hugging his dead sister’s casket!");
        builder.presentAndWait();
        builder.addText("Hamlet’s face goes red. “What is he doing? That’s completely inappropriate; I should set him right for being so wild at his own sister’s funeral!”");
        builder.presentAndWait();
        builder.addText("Horatio puts a hand on his shoulder. “But lord... we can’t hear them. We don’t know the whole story. Let’s wait a while and see what happens.”");
        builder.presentAndWait();

        builder.addOption("Confront Laertes over his behavior", "S1.4");
        builder.addOption("Wait and see what Laertes does", "S1.5");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 3
        //----------------------------------------------------------------------
        builder.mark("S1.3");

        builder.addText("“I burned the letter, preventing the order from going through!” (Sets up Rosencrantz and Guildenstern to return at the very end)");
        builder.presentAndWait();
        builder.addText("Horatio looks worried. “Burning an order with the king’s seal on it? That’s treason, but I suppose it serves the new king right, if he was indeed trying to have you killed.”");
        builder.presentAndWait();
        builder.addText("“You say Claudius killed your father? That’s a bold claim to make,” says the gravedigger. “But if you’re looking for rest, you’ve found the right place.” He gestures to the churchyard, full of faded headstones and gloomy mausoleums.");
        builder.presentAndWait();
        builder.addText("“I suppose... but what man’s grave is this that you’re digging?” asks Hamlet.");
        builder.presentAndWait();
        builder.addText("The gravedigger looks down at the dark pit. “No man’s, sir.”");
        builder.presentAndWait();
        builder.addText("“What woman, then?”");
        builder.presentAndWait();
        builder.addText("“No woman.”");
        builder.presentAndWait();
        builder.addText("“What is being buried here, then?”");
        builder.presentAndWait();
        builder.addText("The gravedigger gives a grim smile. “What was a woman, sir, but bless her, she’s dead now.”");
        builder.presentAndWait();
        builder.addText("Hamlet hangs his head. “Perhaps you can tell us who this woman was?”");
        builder.presentAndWait();
        builder.addText("“Perhaps you can find out, sir, in just a moment.” The gravedigger packs up his shovel and walks away, looking over his shoulder at Hamlet and Horatio. “The funeral party arrives at daybreak.”");
        builder.presentAndWait();
        builder.addText("Hamlet and Horatio look at each other as the gravedigger disappears into the churchyard, chuckling to himself. “Come, Horatio, behind these bushes. Let’s watch the funeral and find out who was being buried on such a chilling night.”");
        builder.presentAndWait();
        builder.addText("“Yes, my lord,” Horatio replies. They pass several gray headstones, on their route to a thicket at the edge of the graveyard.");
        builder.presentAndWait();
        builder.addText("“Why, Horatio, I recognize some of these headstones. People I knew in the past... that is Yorick, a jester I remember from my youth. I used to listen to his jokes; many times he would give me piggyback rides, and yet look at him now.” Hamlet’s face falls. “He lies in such a cold, silent place. A man of such warmth deserved better, yet here he lies.”");
        builder.presentAndWait();
        builder.addText("“I’m sorry, lord,” says Horatio. “But look, here the funeral party comes!”");
        builder.presentAndWait();
        builder.addText("“Here to add to the dead,” Hamlet says gloomily.");
        builder.presentAndWait();
        builder.addText("The procession arrives, and to his surprise Hamlet recognizes many of the faces in the small crowd. Following the priest is his treacherous uncle Claudius, King of Denmark; his mother, the unfaithful queen Gertrude; and Laertes, sister of Ophelia and son of Polonius, who Hamlet killed.");
        builder.presentAndWait();
        builder.addText("And the body... Hamlet’s face turns as white as the gravestones around him. “That... is my beloved Ophelia.”");
        builder.presentAndWait();
        builder.addText("From afar, Hamlet and Horatio cannot hear the words of the mourners in the pale moonlight. Gertrude says some words, tears streaming down her face. The casket is lowered into the pit.");
        builder.presentAndWait();
        builder.addText("Not all is right. Laertes seems to be arguing with the priest over something. “His emotions must be high... after all Ophelia was his sister,” says Horatio. “Poor man.” Laertes does not stop arguing. He raises his fists, begins to yell.");
        builder.presentAndWait();
        builder.addText("Suddenly, tears streak down his face. With a cry, Laertes throws himself into the pit onto the coffin, hugging his dead sister’s casket!");
        builder.presentAndWait();
        builder.addText("Hamlet’s face goes red. “What is he doing? That’s completely inappropriate; I should set him right for being so wild at his own sister’s funeral!”");
        builder.presentAndWait();
        builder.addText("Horatio puts a hand on his shoulder. “But lord... we can’t hear them. We don’t know the whole story. Let’s wait a while and see what happens.”");
        builder.presentAndWait();

        builder.addOption("Confront Laertes over his behavior", "S1.4");
        builder.addOption("Wait and see what Laertes does", "S1.5");
        builder.presentAndWait();
        builder.takeOption();

        //----------------------------------------------------------------------
        // 4
        //----------------------------------------------------------------------
        builder.mark("S1.4");

        builder.addText("“I’m confronting Laertes,” Hamlet cries. “If he can’t show respect to his own sister, my beloved Ophelia, in death, then by God, I will teach him what real grief looks like!”");
        builder.presentAndWait();
        builder.addText("The mourning party hears his outburst and looks over at the bushes where Horatio and Hamlet are hidden. Laertes, though, seems not to notice. As Hamlet pushes his way out of the bushes, he does not look up. He is too miserable.");
        builder.presentAndWait();
        builder.addText("“My darling sister...” Laertes sobs, clinging to Ophelia’s casket. “Triple woe smite the cursed head of the man that drove her to her death! Oh, bury me with her!”");
        builder.presentAndWait();
        builder.addText("The others’ surprised eyes are on Prince Hamlet as he strides over and glares down into the grave at Laertes. He clears his throat. “Who is it whose grief and sorrow are so deep that the great stars and planets above know his pain? This is I, Hamlet the Dane!”");
        builder.presentAndWait();
        builder.addText("Laertes snaps from his sister’s coffin, seeing Hamlet for the first time. “You... you did this!” His eyes are red from crying. “The devil take your soul!”");
        builder.presentAndWait();
        builder.addText("Hamlet snarls and leaps at him. He lands on Laertes and smacks his fist into his chest. Laertes reels, but grabs Hamlet and punches him in the face. The two grapple in the grave before the astonished onlookers.");
        builder.presentAndWait();
        builder.addText("Before they know what has happened, they are dragged out of the grave and separated. Hamlet finds his mother, Queen Gertrude, pulling him back. He sees her face is full of misery and disappointment.");
        builder.presentAndWait();
        builder.addText("Laertes spits at Hamlet. “How dare you! Ophelia drowned herself because of your abusive love, and now you mock me in my despair!”");
        builder.presentAndWait();
        builder.addText("Hamlet shakes his head and shouts back. “I did nothing! And you dishonor her memory by jumping on her dead body!”");
        builder.presentAndWait();
        builder.addText("The two feuders are separated, glaring at each other as they are led away. However, as Laertes is led out, King Claudius clears his throat and leans in.");
        builder.presentAndWait();
        builder.addText("“Prince Hamlet has disrespected you and been a thorn in my side for far too long,” he whispers. “I have a plan to poison the prince. I can tell you more later. Do you accept?”");
        builder.presentAndWait();

        builder.addText("<Unimplemented Original Scenario 1>");
        builder.presentAndWait();
        builder.endGame();

        //----------------------------------------------------------------------
        // 5
        //----------------------------------------------------------------------
        builder.mark("S1.5");

        builder.addText("“I’ll wait and see, then,” Hamlet huffs. “But Ophelia’s memory is disrespected by this outburst...”");
        builder.presentAndWait();
        builder.addText("Hamlet and Horatio hold where they are in the bushes and watch further. Focusing, they begin to hear the faint words of the mourning party.");
        builder.presentAndWait();
        builder.addText("“My darling sister...” Laertes sobs, clinging to Ophelia’s casket. “Triple woe smite the cursed head of the man that drove her to her death! Oh, bury me with her!”");
        builder.presentAndWait();
        builder.addText("The rest of the party looks on somberly at this obsequious show of sorrow. The priest at the head of the group shifts uncomfortably. Laertes, still in the grave, brings himself up to one knee and wipes tears away.");
        builder.presentAndWait();
        builder.addText("“Can no more be done?” he asks. He does not look away from Ophelia’s casket, but his audience is clear.”");
        builder.presentAndWait();
        builder.addText("The priest clears his throat. “Laertes, sir, we’ve discussed this. It would be improper to hold a full ceremony with flowers and requiems considering the... unnatural death your sister came to.”");
        builder.presentAndWait();
        builder.addText("Laertes does not look up. He sighs from deep in his soul, taking in his sister’s absence and the darkness of the night.");
        builder.presentAndWait();
        builder.addText("But Claudius speaks up: “Ophelia was a most noble soul. This midnight charade does her a disservice. Tomorrow we shall return to hold a proper ceremony.”");
        builder.presentAndWait();
        builder.addText("The priest begins to speak up, but Claudius silences him with a glare.");
        builder.presentAndWait();
        builder.addText("Queen Gertrude helps Laertes out of the grave and helps him away. The mourning party exits silently. Hamlet and Horatio exchange glances.");
        builder.presentAndWait();
        builder.addText("“So Laertes wanted a proper ceremony for Ophelia...” Horatio says at last. “It seems he only wanted her to get her proper dues.”");
        builder.presentAndWait();
        builder.addText("“And how he went about showing it!” Hamlet grunts. “Come, good Horatio. Let us get some rest. Tomorrow we have a real funeral to attend.”");
        builder.presentAndWait();
        builder.addText("“You intend to attend, lord?”");
        builder.presentAndWait();
        builder.addText("“I most certainly do. But we will have to be sneaky, Horatio. Listen, this is what we must do...”");
        builder.presentAndWait();

        builder.clearText();
        builder.jumpTo("S2SH.1"); // Sneaky Hamlet Scenario Mark 1
    }
}
