      call EnterURL
 10   call Login
      if (wrongIMAP) goto 30
 20   call ShowForm
      if (wrongKey) goto 20
      call EnterForm
      if (wrongForm) goto 30
      call StartWebMail
      if (loggedOut) goto 10
      if (expired) goto 10
      call Send
      Stop
 30   call ReportError
      call GoBack
      goto 10
      end
