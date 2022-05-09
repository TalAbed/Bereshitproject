# Bereshitproject

<p align="center">
    מטלה 2 – דו"ח סיכום
</p>
<p align="center">
    מגישים: טל עבד, רועי פלג, עידו שפירא
</p>


## מטרה:
במטלה זו התבקשנו לחקור את התרסקות החללית הישראלית בראשית. תחילה הצטרכנו להבין את הסיבות להתרסקות החללית – מה היו הכשלים שגרמו לנחיתה להשתבש.
לאחר שהבנו את הבעיה היינו צריכים לתכנת את נחיתת החללית המתוקנת – להוביל לכך שהיא תנחת בשלום.

## רקע – למה בראשית התרסקה?
ב11 באפריל 2019 בשעות הערב החלה בראשית בתמרון הנחיתה מעל "ים הרוגע" (מכתש ירחי) בירח. בגובה של כ30 קילומטרים מעל פני הירח החלה החללית בנחיתה. עם תחילת הנחיתה נעה החללית סביב הירח כאשר מנועיה פונים לכיוון התנועה. הפעלת המנועים כנגד כיוון התנועה גרמו להאטה במהירות האופקית של החללית ולייצובה בשמי הירח. בשלב זה הופעלו חלק ממנועי המשנה על מנת לשנות את כיוון החללית, כך שתוכל לנחות בקשת אנכית לכיוון הירח. תהליך הנחיתה תוכנן להיות כולו אוטונומי, ללא שליטה מהקרקע. החללית הייתה אמורה להפעיל את כל מנועיה בכדי להתנגד לכוח המשיכה של הירח ולהאט, עד לנחיתה על פני הירח.
בפועל, כאשר הייתה החללית במרחק של כ14 קילומטרים מעל פני הירח, התגלתה תקלה במערכת הIMU השנייה של החללית. מערכת זאת מודדת את התאוצה של החללית. התקלה לא הייתה קריטית להצלחת המשימה וזאת מפני שהייתה מערכת IMU נוספת. למרות זאת, החליט צוות ניהול המשימה לבצע אתחול למערכת. האתחול בוצע ללא תיאום עם צוות המהנדסים.
בעת האתחול לא התקבלו נתוני ניווט מן המד השני. משך האתחול היה 2 שניות ,אך המחשב איתחל את עצמו חמש פעמים נוספות מכיוון שתיקוני התוכנה נמחקו עקב האתחול הראשון. בשלב זה אבד למשך זמן ממושך תקשורת הטלמטריה עם החללית אבדה (ככל הנראה כתוצאה מכך שהחללית הסתובבה על צירה והאנטנה האחראית על הקשר עם כדור הארץ לא הייתה מכוונת כראוי).
על פי תוכנת הנחיתה המנוע היה אמור לפעול מיד בתום האתחול, אך עקב כשל נוסף עליו ידעו המתכננים של החללית (אך לא טיפלו בו מפאת קוצר זמן לפני ההמראה), בעת האתחול ועד לסיומו לאחר טעינת ניסיונות טעינת עדכוני התוכנה, המנוע לא הופעל בהספק הדרוש לבלימת החללית. כאשר חזר המנוע הראשי לפעול הייתה מהירות החללית 900 מטר לשנייה והבלימה הייתה בלתי אפשרית. וכך, למרות שמנועי המשנה פעלו כראוי שייצבו את כיוון החללית, בהיעדר כוח הבלימה של המנוע הראשי, החללית התרסקה. נתון הגובה האחרון שהתקבל מהחללית היה בגובה של 148 מטרים מפני הירח, ולאחר מכן בראשית התרסקה.

## הקוד שלנו
הקוד שלנו מבוסס על הקוד שניתן במטלה. כל עוד החללית בגובה של מעל 2000 קילומטרים מעל פני הירח הבלימה נעשית באותו אופן כמו בקוד המקורי.
כאשר הגובה מתחת ל2000 קילומטרים אנו משתמשים בבקר PID המווסת את עוצמת הבלימה ושולט על המהירות האנכית של החללית. ערכי הPID נמצאו באמצעות "ניסוי וטעייה".
כאשר אנחנו יורדים אל מתחת לגובה של 125 קילומטרים מהירח אנו מגבירים את עוצמת הבלימה למקסימום וממשיכים בירידה הדרגתית לירח, עד לנחיתה.
אנו מגיעים לפני הירח במהירות של מטר לשנייה, עם 20 ליטר דלק נותרים.
ניתן למצוא את הקוד בגיטהאב שלנו בקישור : https://github.com/TalAbed/Bereshitproject.git

•	בתיקיית הגיטהאב ניתן למצוא מחברת פייתון שבה גרפים המציגים באופן ויזואלי את נחיתת החללית.
