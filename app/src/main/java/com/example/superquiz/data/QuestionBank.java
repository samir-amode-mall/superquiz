package com.example.superquiz.data;

import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    public List<Question> getQuestions() {
        return Arrays.asList(
                new Question(
                        "Quel est le bon moyen de déclarer un pointeur en C++ ?",
                        Arrays.asList(
                                "int* ptr;",
                                "int ptr*;",
                                "*int ptr;",
                                "ptr* int;"
                        ),
                        0 // Réponse correcte : "int* ptr;"
                ),
                new Question(
                        "Quel sera le résultat du code suivant ?\n" +
                                "```cpp\n" +
                                "int x = 10;\n" +
                                "int* ptr = &x;\n" +
                                "std::cout << *ptr;\n" +
                                "```\n",
                        Arrays.asList(
                                "Adresse de x",
                                "Valeur de x (10)",
                                "Erreur à la compilation",
                                "Erreur à l'exécution"
                        ),
                        1 // Réponse correcte : "Valeur de x (10)"
                ),
                new Question(
                        "Lequel des suivants est utilisé pour créer un tableau dynamique en C++ ?",
                        Arrays.asList(
                                "malloc()",
                                "new[]",
                                "new()",
                                "calloc()"
                        ),
                        1 // Réponse correcte : "new[]"
                ),
                new Question(
                        "Quelle fonctionnalité C++ permet à une classe dérivée de redéfinir une méthode de la classe de base ?",
                        Arrays.asList(
                                "Héritage",
                                "Polymorphisme",
                                "Encapsulation",
                                "Abstraction"
                        ),
                        1 // Réponse correcte : "Polymorphisme"
                ),
                new Question(
                        "Quelle est la syntaxe correcte pour désallouer une mémoire allouée avec `new` en C++ ?",
                        Arrays.asList(
                                "delete ptr;",
                                "free(ptr);",
                                "delete[] ptr;",
                                "delete(ptr);"
                        ),
                        0 // Réponse correcte : "delete ptr;"
                ),
                new Question(
                        "Quel mot-clé C++ est utilisé pour empêcher l'héritage d'une classe ?",
                        Arrays.asList(
                                "private",
                                "protected",
                                "final",
                                "static"
                        ),
                        2 // Réponse correcte : "final"
                ),
                new Question(
                        "Que produit ce code si `x == 0` ?\n" +
                                "```cpp\n" +
                                "int divide(int a, int b) {\n" +
                                "    assert(b != 0);\n" +
                                "    return a / b;\n" +
                                "}\n" +
                                "int main() {\n" +
                                "    divide(10, 0);\n" +
                                "    return 0;\n" +
                                "}\n",
                        Arrays.asList(
                                "Erreur de compilation",
                                "Comportement indéfini",
                                "Une exception `std::logic_error` est levée",
                                "Le programme termine brutalement avec un message d'assertion échouée"
                        ),
                        3 // Réponse correcte : "Le programme termine brutalement avec un message d'assertion échouée"
                ),
                new Question(
                        "Que signifie SFINAE en C++ ?",
                        Arrays.asList(
                                "Static Function Inlining And Evaluation",
                                "Substitution Failure Is Not An Error",
                                "Standard File Input And Evaluation",
                                "Single Function Initialization And Execution"
                        ),
                        1 // Réponse correcte : "Substitution Failure Is Not An Error"
                ),
                new Question(
                        "Quel est le rôle d'un mutex en programmation multithread ?",
                        Arrays.asList(
                                "Permettre à plusieurs threads d'exécuter simultanément une section critique",
                                "Garantir qu'un seul thread à la fois accède à une ressource partagée",
                                "Remplacer les threads par des coroutines",
                                "Optimiser les performances des threads en les fusionnant"
                        ),
                        1 // Réponse correcte : "Garantir qu'un seul thread à la fois accède à une ressource partagée"
                ),
                new Question(
                        "Pourquoi est-il conseillé de passer un objet complexe par référence constante dans une fonction ?",
                        Arrays.asList(
                                "Cela réduit la mémoire utilisée",
                                "Cela permet de modifier directement l'objet original",
                                "Cela évite de copier l'objet tout en empêchant sa modification",
                                "Cela garantit que l'objet sera supprimé après la fonction"
                        ),
                        2 // Réponse correcte : "Cela évite de copier l'objet tout en empêchant sa modification"
                ),
                new Question(
                        "Que produit ce code ?\n" +
                                "```cpp\n" +
                                "template <typename T>\n" +
                                "T add(T a, T b) {\n" +
                                "    return a + b;\n" +
                                "}\n" +
                                "int main() {\n" +
                                "    std::cout << add(2, 3);\n" +
                                "    return 0;\n" +
                                "}\n",
                        Arrays.asList(
                                "5",
                                "Erreur de compilation, car `add` n'est pas défini pour `int`",
                                "Comportement indéfini",
                                "Rien, car les templates ne sont pas évalués"
                        ),
                        0 // Réponse correcte : "5"
                ),
                // Ajout des 50 autres questions au même format...
                new Question(
                        "Que retourne la fonction `std::unique_ptr` en C++ moderne ?",
                        Arrays.asList(
                                "Un pointeur brut",
                                "Un pointeur intelligent qui prend possession de la ressource",
                                "Une liste des ressources allouées",
                                "Rien, c'est juste un conteneur"
                        ),
                        1 // Réponse correcte : "Un pointeur intelligent qui prend possession de la ressource"
                ),
                new Question(
                        "À quoi sert l'attribut `constexpr` en C++ ?",
                        Arrays.asList(
                                "Déclarer une constante classique",
                                "Exécuter une expression au moment de la compilation",
                                "Optimiser les boucles d'exécution",
                                "Empêcher l'optimisation du compilateur"
                        ),
                        1 // Réponse correcte : "Exécuter une expression au moment de la compilation"
                )
        );
    }

    private static QuestionBank instance;

    public static QuestionBank getInstance() {
        if (instance == null) {
            instance = new QuestionBank();
        }
        return instance;
    }
}
