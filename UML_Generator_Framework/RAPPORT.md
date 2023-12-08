# Problematique
On souhaite créer une Framework qui permet de Générer des diagrammes UML d’un modèle ainsi que
le code source de l’application avec différents langages (Java, C#, etc...).
Un Modèle UML se compose de plusieurs Diagrammes. Il existe différents types de diagrammes :
Digramme de classe, Diagramme Use case, Diagramme de séquences, Diagramme d’Objets, etc. Dans
ce problème, nous nous intéresserons uniquement au diagramme de classe.
## Les information de diagramme de classe
• Un ensemble d’entités qui peuvent être des classes, des interfaces, des énumérateurs ou des
annotations ou des Records. Chaque entité est définie par son nom.
    o Une classe est définie par un groupe d’attributs, un groupe de méthodes (concrètes
ou abstraites) et un groupe de constructeurs. Chaque attribut est défini par son nom,
son type de données, sa visibilité (privé, publique, protégé), si l’attribut est statique
ou non, si l’attribut est final ou non. Pour chaque classe, on doit pouvoir aussi préciser
si elle est publique, abstraite, statique ou finale. Une méthode est définie par son
nom, son type de retour et une liste de paramètres. Chaque paramètre est défini par
son nom et son type. Pour chaque méthode, on doit préciser sa visibilité (publique,
privée ou protégée), statique, final ou abstraite.
    o Une interface est définie par un groupe de méthodes abstraites.
    o Un énumérateur est défini par une liste de valeurs
    o Une annotation est définie par une liste de propriétés
    o Un Record est une classe qui un seul constructeur avec paramètres avec des getters.
• Un ensemble de relations qui trois types : Héritage, implémentation et associations.
    o Pour une association, on distingue deux types : les associations unidirectionnelles et
les relations bidirectionnelles.
    o Chaque association est définie par l’entité source, qui doit être une classe, et l’entité
destination (classe, interface, énumérateur ou annotation). Pour chacune des entités
source et destination, on précise un tableau de deux cardinalités. Une cardinalité
minimale qui peut être soit ZERO ou UN et la cardinalité maximale qui peut être soit
UN ou MANY.
    o Une cardinalité est représentée par un énumérateur.
    o Une relation de type Héritage est définie par une entité source et une entité
destination.
## La conception
![image](https://github.com/ahmederaoui/Design-Patterns/assets/96418903/4cb7eb85-e9bc-472a-8160-9ee2aee052a5)
## Les contraints de la problematique 
• Définir une opération qui permet de générer le code source d’un diagramme de classes en
choisissant une stratégie de génération pour chaque langage de programmation. Le modèle
doit rester extensible pour donner la possibilité d’ajouter de nouvelle implémentation pour
d’autres langages futurs. Dans cette application, il est demandé de définir une implémentation
qui permet de générer le code java du diagramme de classe qui consiste à générer la structure
des classes, interfaces, enumérateurs, annotations du diagramme de classe en prenant en
considération les relations en entre ses différentes entités.
• Exporter un diagramme de classes en différents formats : Sérialisation Binaire, XML, JSON, SVG
etc. en laissant le modèle ouvert aux extensions futurs.
• Définir un aspect de journalisation en utilisant une annotation @Log pour journaliser toutes
actions effectuées sur le diagramme de classes
• Définir un aspect pour verrouiller des méthodes en utilisant l’annotation @Lock. Une méthode
verrouillée ne pourra jamais s’exécuter.
• Donner la possibilité de créer des groupes de classes qui peuvent contenir d’autres groupes
• Adapter une ancienne implémentation qui permet de générer le code en l’intégrant comme
stratégie de générer de code du Framework
• Quand l’état d’un attribut d’une classe change, d’autres observateurs (à définir) de
l’application sont notifiés.
• Appliquer d’autres Pattern que vous jugez important pour votre modèle
## La solusion propose
pour resoudre cette problematique je vais utiliser les design patterns suivants :

- Strategy Pattern (Génération de Code) :

CodeGenerationStrategy est une interface pour définir différentes stratégies de génération de code.
JavaCodeGenerationStrategy implémente CodeGenerationStrategy pour générer le code Java.

- Strategy Pattern (Export de Diagramme) :

DiagramExporterStrategy est une interface qui définit la méthode d'exportation du diagramme.
BinaryExporter, XMLExporter, JSONExporter sont des classes concrètes qui implémente DiagramExporterStrategy pour exporter le diagramme.

- Observer Pattern (Notification des changements d'attributs) :

AttributeObserver est une interface que les observateurs doivent implémenter pour être notifiés des changements d'attributs.
Attributelogger est la classe sujet qui loger les changement.

- Composite Pattern (Groupes de Classes) :

ClassGroup est une classe composite qui peut contenir des classes ou d'autres groupes de classes.

- Adapter Pattern (Ancienne Implémentation) :

OldCodeGeneratorAdapter adapte l'ancienne implémentation pour l'intégrer comme une stratégie de génération de code.
## la conception de la solution
![image](https://github.com/ahmederaoui/Design-Patterns/assets/96418903/26efc6dd-dfe6-4ddd-8677-bc670234c63e)
- Strategy Pattern (Génération de Code) :
![image](https://github.com/ahmederaoui/Design-Patterns/assets/96418903/6492e7ab-791e-444b-9d98-e641f1e394f5)

- Strategy Pattern (Export de Diagramme) :
![image](https://github.com/ahmederaoui/Design-Patterns/assets/96418903/987c4a00-9c71-4e59-a851-1a9737978771)

- Observer Pattern (Notification des changements d'attributs) :
![image](https://github.com/ahmederaoui/Design-Patterns/assets/96418903/226cad59-1930-495d-aa72-edca5486736c)

- Composite Pattern (Groupes de Classes) :
![image](https://github.com/ahmederaoui/Design-Patterns/assets/96418903/1eef9f4d-736f-4d89-a621-8839641f9863)

- Adapter Pattern (Ancienne Implémentation) :
![image](https://github.com/ahmederaoui/Design-Patterns/assets/96418903/0cc4834a-bd47-4106-8b2f-86eb36b3e511)
## Implimentation Et Test
Vous trouverez ces parties dans le code 
