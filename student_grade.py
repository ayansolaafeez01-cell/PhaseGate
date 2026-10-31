      
def student_grade():

    student_number = int(input("Enter StudentNumber: "))
    if student_number <= 0:
        student_number = int(input("Enter a valid StudentNumber: "))
        
    subject_number = int(input("Enter SubjectNumber: "))
    if subject_number <= 0:
        subject_number = int(input("Enter a valid SubjectNumber: "))
        
    scores = [[0 for _ in range(subject_number)] for _ in range(student_number)]
    
    for student in range(student_number):
        print("Student {student + 1}")
        for subject in range(subject_number):
            score = int(input("Enter score for subject {subject + 1}: "))
            
            if score < 0 and score > 100:
                print("Invalid score")
                score = int(input("Enter a score between 0 and 100: "))
                
            scores[student][subject] = score
print(student_grade());
    

