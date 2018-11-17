# SotfwareBiblioteca
Projeto feito pela equipe de Desenvolvimento da Faculdade FASG - Praticas em Desenvolvimento de Software - 2018
![CSCore Logo](http://fs1.directupload.net/images/150528/h8n8qwyc.png)


# CSCore - .NET Audio Library #

[![Github-Release](https://img.shields.io/github/release/filoe/cscore.svg)](https://github.com/filoe/cscore/releases)
[![NuGet-Release](https://img.shields.io/nuget/v/CSCore.svg)](https://www.nuget.org/packages/CSCore/)
[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=N2ZU8PSBFEXPJ)
[![Chat on gitter https://gitter.im/cscorelib/Lobby](https://badges.gitter.im/cscorelib/Lobby.svg)](https://gitter.im/cscorelib/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![NuGet-Release](https://img.shields.io/nuget/vpre/CSCore.Ffmpeg.svg?label=%22nuget%20CScore.Ffmpeg%22)](https://www.nuget.org/packages/CSCore.Ffmpeg/)

CSCore is a free .NET audio library which is completely written in C#. Although it is still a rather young project, it offers tons of features like playing or capturing audio, en- or decoding many different codecs, effects and much more!

CSCore is based on a very extensible architecture which allows you to make it fit to your needs without any major effort. You can build music players, voice chats, audio recorders and so on!

For more details, take a look at the source or the [online documentation](http://filoe.github.io/cscore/sharpDox/).

Feel free to download or clone the source code:

    https://github.com/filoe/cscore.git

You may prefer to install the [CSCore nuget package](https://www.nuget.org/packages/CSCore/):

    Install-Package CSCore
    
For **FFmpeg** support, install the [CSCore.Ffmpeg nuget package](https://www.nuget.org/packages/CSCore.Ffmpeg/)

    Install-Package CSCore.Ffmpeg -Pre
    
### Why CSCore? ###
 - **Highly optimized PERFORMANCE** through usage of CLI instructions
 - **Designed for newbies and professionals** 
 - **Tons of features**
 - **Fast support on [github](https://github.com/filoe/cscore), [codeplex](http://cscore.codeplex.com/) or [stackoverflow](http://stackoverflow.com/questions/tagged/cscore)** 
 - **High code coverage through unit tests** 
 - **Licensed under the MS-PL** (does not include the [CSCore.Ffmpeg](https://github.com/filoe/cscore/tree/master/CSCore.Ffmpeg) project which is licensed under the LGPL)

### Supported Features ###

Currently the following features are implemented:

- **Realtime audio processing**
  - Process audio data in realtime
  - Apply any processors in any order you want in realtime
  - Create custom processors (e.g. effects, analyzes, decoders,...)
- **Codecs** *1
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
