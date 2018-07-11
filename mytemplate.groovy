// Exported from:        http://pc13.home:5516/#/templates/Folder935e868f746c45faa6d82e0138ee16be-Releaseec0d2dbe4534ccba6e7ed422107a162/releasefile
// XL Release version:   8.1.0
// Date created:         Wed Jul 11 20:10:30 CEST 2018

xlr {
  template('MyTemplate') {
    folder('training')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-07-11T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('Test') {
            
          }
        }
      }
    }
    
  }
}