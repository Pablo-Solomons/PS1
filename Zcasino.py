
from random import randrange
continuer="oui"
Random=randrange(50)
Wallet=float(input("De combien sera votre bourse ?\n "))
while Wallet>0 and continuer=="oui" :
        mise=float(input("Combien voulez vous miser ?\n"))
        if mise>Wallet :
            print("Vous navez pas assez d'argent pour miser une telle somme")
            continue
        print("Attention ! votre solde est desormais de",Wallet - mise,"FCFA")
        Random=randrange(50)
        choix=float(input("Entrez le numero sur lequel vous voulez miser\n Un numero entre 0 et 49\n"))
        if choix==Random :
            prix=mise *3
            print("Bravo ! Le numero que vous avez choisi etait le bon, vous recevez ",prix," FCFA")
        elif choix!=Random and ((choix%2==0 and Random%2==0) or  (choix%2!=0 and Random%2!=0)):
            prix=mise/2
            print("Desolé! Le numero etait",Random,"mais vous recevez quand meme",prix,"FCFA")
        else :
            prix=0
            print("Desolé !Le numero mystére etait",Random,"Vous avez perdu") 
        print("Votre solde est desormais de",(Wallet - mise) + prix,"FCFA")    
        P=(Wallet - mise) + prix
        if P>0 :    
            continuer=input("voulez  vous continuer ? OUI ou NON\n")
        else :
             continuer!="oui"    
        Wallet = (Wallet - mise) + prix
