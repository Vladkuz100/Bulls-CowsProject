# Bulls-CowsProject
web app

Цель и основная задача- создание полноценного web- приложения

1-	Функционал приложения - 
У пользователя есть возможность собственно начать игру ( в планах сделать возможность выбора кол-во угадываемых позиций, внешний вид и тд), посмотреть свой рейтинг и % побед

2 – БД - 

В БД на данный момент планирую хранить данные, необходимые для подсчета статистики и рейтинга, а именно – кол-во выигр/проигр игр, 
возможно некоторые вспомогательные поля

По самому проекту - 

есть класс игрок, в котором хранится вся информация об одном игроке - имя, фамилия, ник и пароль, его отличительный  номер, количество очков, сыгранных и выигранных игр.

и непосредственно 
На сервере постоянно крутится код, который отвечает на запросы пользователя

1 - вход / регистрация
вход - сопоставление ника и пароля с имеющимися данными в БД, 
регистрация - соответственно создание нового пользователя и добавление всей информации о нем

2 сама игра 
пользователь отправляет число, сервер возвращает 2 числа - кол-во быков и коров
так продолжается до тех пор, пока количество попыток не правысит определенного числа ( напр 50)

