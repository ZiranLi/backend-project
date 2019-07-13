# backend-project
* User
   - user_id    auto integer
   - username   varchar
   - password   varchar

 * Question
   - question_id   auto integer
   - question_type integer
   - question_text      varchar
   - is_active     boolean

 * Matrix_question (this is for matrix questions, a question_id can corresponding to some matrix item id)
   - question_id   auto integer
   - matrix_item_id      integer
   - is_active     boolean
   - item_text   varchar

 * Matrix_item_detail (this is the matrix item default details in the matrix item)
   - matrix_item_id      integer
   - detail_id     integer
   - detail_text      varchar
   - is_active     boolean

 * Question_choices
   - choice_id        auto integer
   - question_id      integer
   - is_right_choice  boolean
   - choice _text          varchar

 * User_question_answer
   - user_id      integer
   - question_id  integer
   - choice_id    integer
   - is_right     boolean


