# SotfwareBiblioteca
Projeto feito pela equipe de Desenvolvimento da Faculdade FASG - Praticas em Desenvolvimento de Software - 2018
![Gestao Biblioteca Logo](https://uploaddeimagens.com.br/images/001/731/326/full/fundo.png?1542418881)


# Java - Dependencias #

[![MySQL - Release](https://img.shields.io/badge/MySQL-8.0-blue.svg)](https://www.mysql.com/products/enterprise/database/)
[![Git Bash - Release](https://img.shields.io/badge/Git%20Bash-2.19.1-red.svg)](https://gitforwindows.org/)
[![GitHub - Release](https://img.shields.io/badge/Git-Hub-lightgrey.svg)](https://help.github.com/articles/create-a-repo/)


**Projeto criado por Alunos de Analise e Desenvolvimento de Sistemas para fins institucionais.**

Para o Desenvolvimento foi usado o Netbeans IDE 8.2 ultilizando o **JDK SE**

Criados pelos alunos - **Itamar Filho** e **Alcenir Colodetti** sobre orientação do professor *André Bergamin* na matéria de Praticas em Desenvolvimento de Software.

Para mais detalhes sobre o curso, disponibilizo aqui site oficial da Faculdade [FASG](http://www.iesges.edu.br/index.php?page=cursos.ads).


Para baixar como ZIP ou Clonar o repositório segue o Link abaixo:

    https://github.com/JrItamarJr/SotfwareBiblioteca.git

Para inciar o precimento de Clone segue uns comandos que podem ser encontrados neste Link: [Iniciando um Repositório GIT](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository)

    $ git init
    $ git clone https://github.com/JrItamarJr/SotfwareBiblioteca.git
    $ git add *.
    $ git commit -m "Commit Inicial"
    

### Qual o objetivo? ###
 - **Entender como funciona um Sala de Desenvolvimento;** 
 - **Criar modelagem de dados que fique mais seguro e de facil manutenção;** 
 - **Ultilizar a metodologia de Desenvolvimento Agil;**
 - **Entender o funcionamento do Controle de Fonte em um Software  [github](https://github.com/filoe/cscore).** 
 
### Entenda ###

o Software foi remodelado tendo grandes modificações em seu fonte. O resultado disso você verá abaixo:

- **Tela de Login**
  - Validação de Usuario no Banco de Dados;
  - Usuario de Contingência (Para login sem Internet);
  - Layout de Login Customizado.
  
  ![Tela de Login](https://uploaddeimagens.com.br/images/001/731/368/thumb/Tela_Login.PNG?1542421037)
  
  - **Tela de Principal**
  - Validação de Usuario no Banco de Dados;
  - Usuario de Contingência (Para login sem Internet);
  - Layout de Login Customizado.
  
  ![Tela Principal](https://image.ibb.co/inPi4f/Tela-Principal.png)
  
- **Codecs**
  - MP3
  - WAVE (PCM, IeeeFloat, GSM, ADPCM,...)
  - FLAC
  - AAC
  - AC3
  - WMA
  - Raw data
  - OGG-Vorbis (through NVorbis)
  - FFmpeg (lots of additional formats, see [CSCore.Ffmpeg](https://github.com/filoe/cscore/tree/master/CSCore.Ffmpeg))
- **FFmpeg support**
  - Supported through [CSCore.Ffmpeg](https://github.com/filoe/cscore/tree/master/CSCore.Ffmpeg))
- **Speaker Output**
  - WaveOut
  - DirectSoundOut (realtime streaming)
  - WASAPI (loop- and event-callback + exclusive mode available)
  - XAudio2
- **Recording**
  - WaveIn
  - WASAPI (loop- and event-callback + exclusive mode available)
  - WASAPI loopback capture (capture output from soundcard)
- **DSP Algorithms**
  - Fastfouriertransform (FFT)
  - Effects (Echo, Compressor, Reverb, Chorus, Gargle, Flanger,...)
  - Resampler
  - Channel-mixing using custom channel-matrices
  - Generic Equalizer
  - ...
- **XAudio2 support**
  - XAudio2.7 and XAudio2.8 support
  - 3D Audio support (see X3DAudio sample)
  - Streaming source voice implementation allowing
    the client to stream any codec, custom effect,... to XAudio2
  - Optimized for games
- **Mediafoundation encoding and decoding**
- **DirectX Media Objects Wrapper**
- **CoreAudioAPI Wrapper**
  - WASAPI
  - Windows Multimedia Devices
  - Windows Audio Session
  - Endpoint Volume,...
- **Multi-Channel support**
- **Flexible**
  - Configure and customize any parts of CSCore
  - Use low latency values for realtime performance, high latency values for stability
  - Adjust the audio quality
  - Configure custom channel matrices
  - Create custom effects
  - ...
  - Or simply: **Make CSCore fit your needs!**
- **Tags** (ID3v1, ID3v2, FLAC)
- **Sample Winforms Visualizations**
- **Optimized performance though the usage of CLI instructions provided by a custom post compiler**

**\*1** Some Codecs are only available on certain platforms. For more details, see [Codeplex-Page](http://cscore.codeplex.com/).

Some projects using already using cscore:
- [Dopamine](http://www.digimezzo.com/software/dopamine/): _An music player which tries to keep listening to music clean and simple._
- [Hurricane](https://github.com/Alkalinee/Hurricane): _Is a powerful music player written in C# based on [CSCore sound library](https://github.com/filoe/cscore)._
- [Sharpex2D](https://github.com/ThuCommix/Sharpex2D): A game engine which _allows you to create beautiful 2D games under .NET for Windows and Mono compatible systems_
- [Turnt-Ninja](https://github.com/opcon/turnt-ninja): A beat-fighting-ninja-like-get-turnt rhythm game inspired by the wonderful Super Hexagon by Terry Cavanagh.
- [HTLED](https://www.youtube.com/watch?v=tbrKepBgH3M): A audio visualization displayed on a selfmade 32x16 LED matrix.
- ...

#### Samples: ####

["CSCore - Visualization"](Samples/WinformsVisualization) Sample:

![VIS_SAMPLE](http://download-codeplex.sec.s-msft.com/Download?ProjectName=cscore&DownloadId=970569)

["CSCoreWaveform"](Samples/CSCoreWaveform) Sample:

![WAVFRM_SAMPLE](http://fs5.directupload.net/images/160229/adjvd9u9.png)

For more samples see [Samples](Samples/)

#### As long as this document is in development, see [Codeplex](http://cscore.codeplex.com/) for more details.  ####
