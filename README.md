# RabbitmqExemple

L'intégration de Spring permet une messagerie légère dans les applications Spring et prend en charge l'intégration avec des systèmes externes via des adaptateurs déclaratifs. Ces adaptateurs fournissent un niveau d'abstraction plus élevé que le support de Spring pour la communication à distance, la messagerie et la planification. L'objectif principal de Spring Integration est de fournir un modèle simple pour la création de solutions d'intégration d'entreprise tout en maintenant la séparation des préoccupations essentielle à la production de code durable et testable.
Pourquoi RabbitMQ:
Découpler l'éditeur de message et le consommateur
Stocker les messages
Routage des messages
Surveillance et gestion des messages




http://localhost:8080/sender/send

{
  "mobileno":"123338399404",
  "route":"song",
  "message":"THIS IS FOR SONG MESSAGE"
  
}


{
  "mobileno":"123338399404",
  "route":"movie",
  "message":"THIS IS FOR SONG MESSAGE"
  
}
