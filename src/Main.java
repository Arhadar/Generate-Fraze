public class Main {


            public static void main(String[] args) { //Создайте три набора слов для выбора. Добавляйте собственные слова!
                String[] wordListOne = {"круглосуточный", "трех-звенный",
                        "30000-футовьй", "взаимный", "обовдный выигрыш", "фронтэнд",
                        "на основе веб-технологий", "проникащий", "умный", "шестьсит", "метод критического пути", "динамичный"};
                String[] wordListTwo =
                        {"уполномоченный", "трудный",
                                "чистый продукт", "ориентированный", "центральный",
                                "распределенный", "кластеризованный", "фирменный",
                                "нестандартный ум", "позиционированный", "сетевой",
                                "сфокусированный", "использованный с выгодой", "выровненный",
                                "нацеленный на", "общий", "совместный", "ускоренный"};
                String[] wordListThree =
                        {"процесс", "пункт разгрузки",
                                "выход из положения", "тип структуры", "талант", "подход",
                                "уровень завоеванного внимания", "портал", "период времени",
                                "обзор", "образец", "пункт следования"};
                int oneLength =
                        wordListOne.length;
                int twoLength =
                        wordListTwo.length;
                int threeLength =
                        wordListThree.length;

                for(;;){//Генерируемтри случайных числа
                    int randl =
                            (int) (Math.random() *
                                    oneLength);
                    int rand2 =
                            (int) (Math.random() *
                                    twoLength);
                    int rand3 =
                            (int) (Math.random() *
                                    threeLength);
                    //Теперь строим фразу
                    String phrase =
                            wordListOne[randl] + " "
                                    +
                                    wordListTwo[rand2] + " "
                                    + wordListThree[rand3];
                    //Выводимфразу на экран
                    System.out.println("Все, что нам нужно, - это "
                            + phrase);

                }
            }
        }