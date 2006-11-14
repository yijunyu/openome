      CALL EnterURL
      REPEAT
      REPEAT
        CALL Login
         IF (.not.wrongIMAP) THEN
           REPEAT
               CALL ShowForm
           UNTIL (.not.wrongKey)
           CALL EnterForm
           IF(.not.wrongForm)THEN
              CALL StartWebmail
           ENDIF
        ENDIF 
      UNTIL (.not.loggedOut.or .not.expired.or.wrongIMAP.or.wrongForm)
      IF(wrongIMAP.or.wrongForm)
      THEN
         CALL ReportError
         CALL GoBack
      ENDIF
      UNTIL (.not.wrongIMAP.and.not.wrongForm)
      CALL Send
      END
      
